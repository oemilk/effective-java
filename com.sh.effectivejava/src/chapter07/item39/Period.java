package chapter07.item39;

import java.util.Date;

// 결함 있는 불변 기간 클래스
public final class Period {

    private final Date start;
    private final Date end;

//    /**
//     * @param start 시작일
//     * @param end 종료일, 시작일보다 빠르면 안됨
//     * @throws IllegalArgumentException 시작일이 종료일보다 늦으면 발생
//     * @throws NullPointerException 시작일이나 종료일이 null 이면 발생
//     */
//    public Period(Date start, Date end) {
//        if (start.compareTo(end) > 0) {
//            throw new IllegalArgumentException(start + " after " + end);
//        }
//        this.start = start;
//        this.end = end;
//    }

    // 수정된 생성자 - 매개 변수의 방어 복사본을 만든다
    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (this.start.compareTo(this.end) > 0) {
            throw new IllegalArgumentException(start + " after " + end);
        }
    }

//    public Date start() {
//        return start;
//    }

//    public Date end() {
//        return end;
//    }

    // 수정된 접근자 메서드 - 내부 필드의 방어 복사본을 만든다
    public Date end() {
        return new Date(end.getTime());
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public static void main(String[] args) {

        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        System.out.println(p.end().toString());
        end.setYear(11); // p의 내부를 변경
        System.out.println(p.end().toString());

        start = new Date();
        end = new Date();
        p = new Period(start, end);
        System.out.println(p.end().toString());
        p.end().setYear(11); // p의 내부를 변경
        System.out.println(p.end().toString());

    }

}
