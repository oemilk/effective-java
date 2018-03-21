package chapter06.item30;

// 자신의 상수 값을 switch 문으로 검사하여 연산하는 enum 타입
// 문제가 많다
public enum Operation {

    PLUS, MINUS;

    // 상수 값으로 나타내는 산술 연산을 수행
    double apply(double x, double y) {
        switch (this) {
            case PLUS: return x + y;
            case MINUS: return x - y;
        }
        throw new AssertionError("unknown op : " + this);
    }

}
