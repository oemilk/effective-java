package chapter11.item78;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

// Period 클래스의 직렬화 프록시
public final class Period implements Serializable {

    private final Date start;
    private final Date end;

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

    // 직렬화 프록시 패턴의 writeReplace 메서드
    private Object writeReplace() {
        return new SerializationProxy(this);
    }

    // 직렬화 프록시 패턴의 readObject 메서드
    private void readObject(ObjectInputStream stream)
            throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

    // Period 클래스의 직렬화 프록시
    private static class SerializationProxy implements Serializable {
        private static final long serialVersionUID = 0;
        private final Date start;
        private final Date end;

        SerializationProxy(Period p) {
            this.start = p.start;
            this.end = p.end;
        }

        private Object readResolve() {
            return new Period(start, end);
        }
    }

}
