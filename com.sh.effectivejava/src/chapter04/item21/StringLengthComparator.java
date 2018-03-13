package chapter04.item21;

class StringLengthComparator {

    private static final StringLengthComparator INSTANCE
            = new StringLengthComparator();

    private StringLengthComparator() {

    }

    public static StringLengthComparator getInstance() {
        return INSTANCE;
    }

    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }

}
