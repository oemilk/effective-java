package chapter07.item42;

class Main {

    public static int sum(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

//    public static int min(int... args) {
//        if (args.length == 0) {
//            throw new IllegalArgumentException("인자가 없음");
//        }
//
//        int min = args[0];
//        for (int i = 1; i < args.length; i++) {
//            if (args[i] < min) {
//                min = args[i];
//            }
//        }
//        return min;
//    }

    public static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs) {
            if (arg < min) {
                min = arg;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int sum = sum(1, 2, 3);
        int min = min(0, 1, 2, 3);

        System.out.println(sum + " " + min);
    }

}
