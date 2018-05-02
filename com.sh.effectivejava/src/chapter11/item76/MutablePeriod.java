package chapter11.item76;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class MutablePeriod {

    // Period 인스턴스
    public final Period period;

    // 시작/종료 일자, 접근하지 못했어야 하는 필드
    public final Date start;
    public final Date end;

    public MutablePeriod() {
        try {
            ByteArrayOutputStream bos =
                    new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);

            // 적법한 Period 인스턴스를 직렬화 한다
            out.writeObject(new Period(new Date(), new Date()));

            /*
            Period 내부의 Date 필드에 사악한 참조를 추가한다
             */
            byte[] ref = {0x71, 0, 0x7e, 0, 5}; // 객체 참조 #5
            bos.write(ref); // 시작 일자 필드
            ref[4] = 4; // 객체 참조 #4
            bos.write(ref); // 종료 일자 필드

            // Period 인스턴스를 역직렬화 한 후 Date 참조를 훔친다
            ObjectInputStream in = new ObjectInputStream(
                    new ByteArrayInputStream(bos.toByteArray())
            );
            period = (Period) in.readObject();
            start = (Date) in.readObject();
            end = (Date) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new AssertionError(e);
        }
    }

    public static void main(String[] args) {
        MutablePeriod mutablePeriod = new MutablePeriod();
        Period period = mutablePeriod.period;
        Date pEnd = mutablePeriod.end;

        pEnd.setYear(90);
        System.out.println(period);

        pEnd.setYear(87);
        System.out.println(period);
    }

}
