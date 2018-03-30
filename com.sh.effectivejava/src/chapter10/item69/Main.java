package chapter10.item69;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

class Main {

    private static final ConcurrentMap<String, String> map =
            new ConcurrentHashMap<>();

    // ConcurrentMap 기반의 동시적 정규 Map - 더 잘 만들 수 있다
    public static String intern(String s) {
        String previousValue = map.putIfAbsent(s, s);
        return previousValue == null ? s : previousValue;
    }

    // ConcurrentMap 기반의 동시적 정규 Map - 더 빠르다
    public static String intern2(String s) {
        String result = map.get(s);
        if (result == null) {
            result = map.putIfAbsent(s, s);
            if (result == null) {
                result = s;
            }
        }
        return result;
    }

    // 동시적 실행의 시간을 재는 간단한 프레임워크
    public static long time(Executor executor, int concurrency, final Runnable action) throws
            InterruptedException {
        final CountDownLatch ready = new CountDownLatch(concurrency);
        final CountDownLatch start = new CountDownLatch(1);
        final CountDownLatch done = new CountDownLatch(concurrency);
        for (int i = 0; i < concurrency; i++) {
            executor.execute(() -> {
                ready.countDown(); // 준비 OK를 타이머에게 알림
                try {
                    start.await(); // 준비 완료를 기다린다.
                    action.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                } finally {
                    done.countDown(); // 끝났음을 타이머에게 알림
                }
            });
        }

        ready.await(); // 모든 일꾼 스레드가 준비될 때까지 기다린다.
        long startNanos = System.nanoTime();
        start.countDown(); // 동작을 시작시킨다!
        done.await(); // 모든 일꾼 스레드가 끝날 때까지 기다린다.
        return System.nanoTime() - startNanos;
    }

    public static void main(String[] args) {
        try {
            Thread thread = new Thread();
            thread.wait(); // 이용 X
            thread.notify(); // 이용 X
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
