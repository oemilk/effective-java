package chapter04.item20;

// 태그 클래스 - 클래스 계층보다 조악하다.
class Figure {

    enum Shape {RECTANGLE, CIRCLE}

    // 태그 필드
    final Shape shape;

    // 이 필드는 shape가 RECTANGLE 일 때만 이용
    double length;
    double width;

    // 이 필드는 shape가 CIRCLE 일 때만 이용
    double radius;

    // circle 생성자
    Figure(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    // rectangle 생성자
    Figure(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch (shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError();
        }
    }

}
