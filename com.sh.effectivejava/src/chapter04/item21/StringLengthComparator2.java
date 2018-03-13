package chapter04.item21;

class StringLengthComparator2 implements Comparator<String> {

    @Override
    public int compare(String t1, String t2) {
        return t1.length() - t2.length();
    }

}
