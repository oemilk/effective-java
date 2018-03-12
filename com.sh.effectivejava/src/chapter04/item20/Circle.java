package chapter04.item20;

class Circle extends Figure2 {

    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }

}