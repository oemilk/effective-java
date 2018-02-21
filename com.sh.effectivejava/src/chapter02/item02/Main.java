package chapter02.item02;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        TelescopingConstructor telescopingConstructor
                = new TelescopingConstructor(100, 10, 2,
                23, 9, 2);

        JavaBeans javaBeans = new JavaBeans();
        javaBeans.setServingSize(100);
        javaBeans.setServings(10);
        javaBeans.setCalories(2);
        javaBeans.setFat(23);
        javaBeans.setSodium(9);
        javaBeans.setCarbohydrate(2);

        BuilderPattern builderPattern
                = new BuilderPattern.Builder(10, 20)
                .calories(100)
                .sodium(5)
                .carbohydrate(23)
                .build();

    }

}
