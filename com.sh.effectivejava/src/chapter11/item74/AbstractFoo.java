package chapter11.item74;

import java.util.concurrent.atomic.AtomicReference;

// 자신은 직렬화 불가능 하지만, 직렬화 가능한 서브 클래스를 허용하는 클래스
public abstract class AbstractFoo {

    private final AtomicReference<State> init = new AtomicReference<>(State.NEW);
    private int x, y; // 인스턴스 상태

    public AbstractFoo(int x, int y) {
        initialize(x, y);
    }

    // 다음의 생성자와 메서드는 서브 클래스의 readObject 메서드에서
    // 이 인스턴스 상태를 초기화할 수 있게 해준다.
    protected AbstractFoo() {
    }

    protected final void initialize(int x, int y) {
        if (!init.compareAndSet(State.NEW, State.INITIALIZING)) {
            throw new IllegalStateException("Already initialized");
        }
        this.x = x;
        this.y = y;
        // ... // 원래의 생성자가 했던 나머지 일을 수행한다.
        init.set(State.INITIALIZED);
    }

    // 이 메서드에서는 내부 상태로의 접근을 허용한다.
    // 따라서 서브 클래스의 writeObject 메서드를 이용해서
    // 독자적인 직렬화를 할 수 있다.
    protected final int getX() {
        checkInit();
        return x;
    }

    protected final int getY() {
        checkInit();
        return y;
    }

    // 모든 public과 protected 인스턴스 메서드에서 호출해야 한다.
    private void checkInit() {
        if (init.get() != State.INITIALIZED) {
            throw new IllegalStateException("Uninitialized");
        }
    }

    // 이 enum과 필드는 초기화 추적에 사용된다.
    private enum State {
        NEW, INITIALIZING, INITIALIZED
    }

}
