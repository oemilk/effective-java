package chapter11.item74;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Foo extends AbstractFoo implements Serializable {

    private static final long serialVersionUID = 1856835860954L;

    // 이 생성자는 직렬화 메커니즘에서 사용되지 않는다.
    public Foo(int x, int y) {
        super(x, y);
    }

    private void readObject(ObjectInputStream s)
            throws IOException, ClassNotFoundException {
        s.defaultReadObject();

        // 슈퍼 클래스의 상태를 직접 역직렬화하고 초기화한다
        int x = s.readInt();
        int y = s.readInt();
        initialize(x, y);
    }

    private void writeObject(ObjectOutputStream s)
            throws IOException {
        s.defaultWriteObject();

        // 슈퍼 클래스의 상태를 직접 직렬화한다
        s.writeInt(getX());
        s.writeInt(getY());
    }

}
