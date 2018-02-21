package chapter02.item03;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonMethod implements Serializable {

    private static final SingletonMethod INSTANCE = new SingletonMethod();

    private SingletonMethod() {
        if (INSTANCE != null){
            throw new RuntimeException(
                    "Use getInstance() method to get the single instance of this class.");
        }
    }

    public static SingletonMethod getInstance() {
        return INSTANCE;
    }

    // 싱글톤의 특성 보존을 위한 메서드
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }

    public void testMethod() {}

}


