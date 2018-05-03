package chapter11.item78;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class BogusPeriod {

    // 실제 Period 인스턴스에서는 나올 수 없는 바이트 스트림!
    private static final byte[] serializedForm = new byte[]
            {-84, -19, 0, 5, 115, 114, 0, 42, 99, 104,
                    97, 112, 116, 101, 114, 49, 49, 46, 105, 116,
                    101, 109, 55, 56, 46, 80, 101, 114, 105, 111,
                    100, 36, 83, 101, 114, 105, 97, 108, 105, 122,
                    97, 116, 105, 111, 110, 80, 114, 111, 120, 121,
                    0, 0, 0, 0, 0, 0, 0, 0, 2, 0,
                    2, 76, 0, 3, 101, 110, 100, 116, 0, 16,
                    76, 106, 97, 118, 97, 47, 117, 116, 105, 108,
                    47, 68, 97, 116, 101, 59, 76, 0, 5, 115,
                    116, 97, 114, 116, 113, 0, 126, 0, 1, 120,
                    112, 115, 114, 0, 14, 106, 97, 118, 97, 46,
                    117, 116, 105, 108, 46, 68, 97, 116, 101, 104,
                    106, -127, 1, 75, 89, 116, 25, 3, 0, 0,
                    120, 112, 119, 8, 0, 0, 55, -29, -29, -118,
                    -61, -82, 120, 115, 113, 0, 126, 0, 3, 119,
                    8, 0, 0, 55, -21, 59, 59, -17, -82, 120};

    public static void main(String[] args) {
        Period p = (Period) deserialize(serializedForm);
        System.out.println(p);
    }

    // 지정된 직렬화 형태의 객체를 반환한다
    private static Object deserialize(byte[] sf) {
        try {
            InputStream is = new ByteArrayInputStream(sf);
            ObjectInputStream ois = new ObjectInputStream(is);
            return ois.readObject();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

}
