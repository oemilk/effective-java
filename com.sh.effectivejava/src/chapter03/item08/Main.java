package chapter03.item08;

import com.sun.prism.paint.Color;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        CaseInsensitiveString cis = new CaseInsensitiveString("Test");
        String s = "test";

        System.out.println(cis.equals(s) + " / " + s.equals(cis));

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);

        System.out.println(list.contains(s));

        Point point = new Point(10, 20);
        ColorPoint colorPoint = new ColorPoint(10, 20, Color.BLUE);

        System.out.println(point.equals(colorPoint) + " / " + colorPoint.equals(point));

        ColorPoint p1 = new ColorPoint(10, 20, Color.BLUE);
        Point p2 = new Point(10, 20);
        ColorPoint p3 = new ColorPoint(10, 20, Color.RED);

        System.out.println(p1.equals(p2) + " / " + p2.equals(p3)+ " / " + p1.equals(p3));

        ColorPointComposition cp1 = new ColorPointComposition(10, 20, Color.BLUE);
        ColorPointComposition cp2 = new ColorPointComposition(10, 20, Color.BLUE);

        System.out.println(cp1.equals(cp2));
    }

}


