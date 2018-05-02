package chapter11.item76;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

// 방어 복사를 이용하는 불변 클래스
public final class Period implements Serializable {

    private Date start;
    private Date end;

    /**
     * @param start 시작일
     * @param end   종료일로서 시작일보다 빠르면 안 된다
     * @throws IllegalArgumentException 시작일이 종료일보다 늦으면 발생
     */
    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (this.start.compareTo(this.end) > 0) {
            throw new IllegalArgumentException(start + " after " + end);
        }
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }

    public String toString() {
        return start + " - " + end;
    }

//    // 객체의 유효성을 검사하는 readObject 메서드
//    private void readObject(ObjectInputStream s)
//            throws IOException, ClassNotFoundException {
//        s.defaultReadObject();
//
//        // 종료 일자가 시작 일자보다 늦어야 하는 불변 규칙을 지키는지 검사
//        if (start.compareTo(end) > 0) {
//            throw new InvalidObjectException(start + " after " + end);
//        }
//    }

    // 방어 복사와 유효성 검사를 하는 readObject 메서드
    private void readObject(ObjectInputStream s)
            throws IOException, ClassNotFoundException {
        s.defaultReadObject();

        // 가변 컴포넌트를 방어 복사한다
        start = new Date(start.getTime());
        end = new Date(end.getTime());

        // 종료 일자가 시작 일자보다 늦어야 하는 불변 규칙을 지키는지 검사
        if (start.compareTo(end) > 0) {
            throw new InvalidObjectException(start + " after " + end);
        }
    }

}
