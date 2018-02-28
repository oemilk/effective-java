package chapter03.item08;

import com.sun.prism.paint.Color;

public class ColorPointComposition {

    private final Point point;
    private final Color color;

    public ColorPointComposition(int x, int y, Color color) {
        if (color == null) {
            throw new NullPointerException();
        }

        this.point = new Point(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ColorPointComposition)) {
            return false;
        }

        ColorPointComposition cp = (ColorPointComposition) obj;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
