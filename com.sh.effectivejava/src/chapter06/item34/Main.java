package chapter06.item34;

import java.util.Arrays;
import java.util.Collection;

class Main {

    private static <T extends Enum<T> & Operation> void test(Class<T> opSet, double x, double y) {
        for (Operation op : opSet.getEnumConstants()) {
            // BasicOperation
            // 3.400000 + 1.200000 = 4.600000
            // 3.400000 - 1.200000 = 2.200000
            // ExtendedOperation
            // 3.400000 ^ 1.200000 = 4.342849
            // 3.400000 % 1.200000 = 1.000000
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }

    private static void test2(Collection<? extends Operation> opSet, double x, double y) {
        for (Operation op : opSet) {
            // ExtendedOperation
            // 3.400000 ^ 1.200000 = 4.342849
            // 3.400000 % 1.200000 = 1.000000
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }

    private static void enumTest(BasicOperation op, double x, double y) {
        // 3.400000 + 1.200000 = 4.600000
        System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }

    private static void enumTest2(ExtendedOperation op, double x, double y) {
        // 3.400000 ^ 1.200000 = 4.342849
        System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }

    public static void main(String[] args) {
        double x = 3.4;
        double y = 1.2;


        test(BasicOperation.class, x, y);
        test(ExtendedOperation.class, x, y);

        test2(Arrays.asList(ExtendedOperation.values()), x, y);

        enumTest(BasicOperation.PLUS, x, y);
        enumTest2(ExtendedOperation.EXP, x, y);
    }

}
