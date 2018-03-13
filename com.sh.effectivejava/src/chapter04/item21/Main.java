package chapter04.item21;

class Main {

    static void operation(Comparator comparator) {
        int result = comparator.compare("a", "bb");
    }

    public static void main(String[] args) {

        operation(new StringLengthComparator2());
        // operation(new StringLengthComparator3());

    }

}
