package chapter11.item77;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ElvisImpersonator {

    // 이 바이트 스트림은 직렬화된 Elvis 인스턴스를 직접 수정한 것이다!
    private static final byte[] serializedForm = new byte[]{
            -84, -19, 0, 5, 115, 114, 0, 22, 99, 104,
            97, 112, 116, 101, 114, 49, 49, 46, 105, 116,
            101, 109, 55, 55, 46, 69, 108, 118, 105, 115,
            38, -121, -41, 33, 26, 109, -42, -74, 2, 0,
            1, 91, 0, 13, 102, 97, 118, 111, 114, 105,
            116, 101, 83, 111, 110, 103, 115, 116, 0, 19,
            91, 76, 106, 97, 118, 97, 47, 108, 97, 110,
            103, 47, 83, 116, 114, 105, 110, 103, 59, 120,
            112, 117, 114, 0, 19, 91, 76, 106, 97, 118,
            97, 46, 108, 97, 110, 103, 46, 83, 116, 114,
            105, 110, 103, 59, -83, -46, 86, -25, -23, 29,
            123, 71, 2, 0, 0, 120, 112, 0, 0, 0,
            2, 116, 0, 14, 74, 97, 105, 108, 104, 111,
            117, 115, 101, 32, 82, 111, 99, 107, 116, 0,
            9, 72, 111, 117, 110, 100, 32, 68, 111, 103
    };

    public static void main(String[] args) {
        // Initializes ElvisStealer.impersonator and returns
        // the real Elvis (which is Elvis.INSTANCE)
        Elvis elvis = (Elvis) deserialize(serializedForm);
        Elvis impersonator = ElvisStealer.impersonator;

        elvis.printFavorites();
        impersonator.printFavorites();
    }

    // Returns the object with the specified serialized form
    private static Object deserialize(byte[] sf) {
        Object result=null;
        try {
            InputStream is = new ByteArrayInputStream(sf);
            ObjectInputStream ois = new ObjectInputStream(is);
            result= ois.readObject();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
        return result;
    }

}
