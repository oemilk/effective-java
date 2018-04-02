package chapter07.item38;

class Main {


    /**
     * int 배열에서 해당 index의 값을 반환한다.
     * @param index 반드시 0 이거나 양수여야 한다.
     * @return int 배열의 해당 index 값
     * @throws IndexOutOfBoundsException 만약 index가 0보다 작으면
     */
    public static int getValue(int index){
        if (index < 0) {
            throw new IndexOutOfBoundsException("index < 0 : " + index);
        }
        // do operations
        return 0;
    }

    private static void sort(long l[], int offset) {
        assert l != null;
        assert offset >= 0;

        // do operations
    }

    public static void main(String[] args) {
//        getValue(-1);
        sort(null, 0);
    }

}
