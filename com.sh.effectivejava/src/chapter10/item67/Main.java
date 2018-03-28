package chapter10.item67;

import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Main {

    public static void main(String[] args) {
        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());
        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> set, Integer element) {
                System.out.println(element);
                if (element == 4) {
                    ExecutorService service = Executors.newSingleThreadExecutor();
                    final SetObserver<Integer> observer = this;
                    try {
                        service.submit(() -> set.removeObserver(observer)).get();
                    } catch (ExecutionException | InterruptedException e) {
                        throw new AssertionError(e.getCause());
                    } finally {
                        service.shutdown();
                    }

                    set.removeObserver(this);
                }
            }
        });

        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
    }

}
