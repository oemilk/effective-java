package chapter06.item31;

class Main {

    public enum Ensemble {

        SOLE, DUET, TRIO, QUARTET, QUINTET,
        SEXTET, SEPTET, OCTET, NONET, DECTET;

        public int numberOfMusicians() {
            return ordinal() + 1;
        }

    }

    public enum Ensemble2 {

        SOLE(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5),
        SEXTET(6), SEPTET(7), OCTET(8), NONET(9), DECTET(10),
        TRIPLE_QUARTET(12);

        private final int numberOfMusicians;

        Ensemble2(int size) {
            numberOfMusicians = size;
        }

        public int numberOfMusicians() {
            return numberOfMusicians;
        }

    }

    public static void main(String[] args) {
        for (Ensemble enseble : Ensemble.values()) {
            // 1 2 3 4 5 6 7 8 9 10
            System.out.println(enseble.numberOfMusicians());
        }

        for (Ensemble2 enseble : Ensemble2.values()) {
            // 1 2 3 4 5 6 7 8 9 10 12
            System.out.println(enseble.numberOfMusicians());
        }
    }

}
