package chapter02.item04;

// 인스턴스 생성이 불가능한 클래스
public class DefaultConstructor {

    // Default 생성자가 자동으로 생기는 것을 방지한다.
    private DefaultConstructor() {
        throw new AssertionError();
    }

    static void showMessage(String msg) {
        // show message
    }

}

