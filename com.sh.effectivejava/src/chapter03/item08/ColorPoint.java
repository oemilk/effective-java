package chapter03.item08;

import com.sun.prism.paint.Color;

public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // 대칭성에 위반 된다.
//    @Override
//    public boolean equals(Object obj) {
//        // return super.equals(obj); // Color 무시됨
//
//        if (!(obj instanceof ColorPoint)) {
//            return false;
//        }
//
//        return super.equals(obj) && ((ColorPoint) obj).color == color;
//    }

    // 이행성에 위반 된다.
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }

        // obj가 Point 객체라면, Color를 빼고 비교한다.
        if (!(obj instanceof ColorPoint)) {
            return obj.equals(this);
        }

        // obj가 ColorPoint 객체라면, Point와 Color 모두 비교한다.
        return super.equals(obj) && ((ColorPoint) obj).color == color;
    }

}
