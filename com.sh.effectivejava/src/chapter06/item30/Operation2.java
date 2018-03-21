package chapter06.item30;

// 특정 상수 메서드를 구현하는 enum 타입
public enum Operation2 {

    PLUS {
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    };

    abstract double apply(double x, double y);

}
