package chapter03.item11;

public final class PhoneNumber {

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 9999, "lineNumber");

        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private static void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max) {
            throw new IllegalArgumentException(name + " : " + arg);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof PhoneNumber)) {
            return false;
        }

        PhoneNumber pn = (PhoneNumber) obj;
        return pn.areaCode == areaCode
                && pn.prefix == prefix
                && pn.lineNumber == lineNumber;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + areaCode;
        result = 31 * result + prefix;
        result = 31 * result + lineNumber;
        return result;
    }

    /**
     * {@link PhoneNumber} 객체(전화번호)의 문자열 표현을 반환한다.
     * 문자열은 14자이며 형식은 "(XXX) YYY-ZZZZ"이다.
     * 여기서 XXX는 지역번호, YYY는 국번호, ZZZZ는 선번호이다.
     * 각 영문 대문자는 한 자리의 10진수를 나타낸다.
     * 지역번호 우 괄호(")") 다음에는 스페이스(" ")를 하나 추가한다.
     */
    @Override
    public String toString() {
        return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber);
    }

    @Override
    protected PhoneNumber clone() {
        try {
            // super가 아닌 PhoneNumber 타입으로 변환
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // 이 예외가 발생할 수 없음
        }
    }

}
