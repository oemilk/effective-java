package chapter11.item75;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 독자적인 직렬화 형태를 사용한 StringList
final class StringList implements Serializable {

    private transient int size = 0;
    private transient Entry head = null;

    // 물리적 표현은 더 이상 직렬화되지 않는다!
    private static class Entry {
        String data;
        Entry next;
        Entry previous;
    }

    // 지정한 문자열을 리스트에 추가한다
    public final void add(String s) {/*...*/}

    /**
     * 이 {@code StringList} 인스턴스를 직렬화한다.
     *
     * @serialData 리스트의 크기(리스트가 포함하는 문자열 개수)는
     * ({@code int})로 나오며, 그 다음에 그 리스트의 모든
     * 요소들이 (각각 {@code String} 타입인)
     * 순서대로 따라 나온다.
     */
    private void writeObject(ObjectOutputStream s)
            throws IOException {
        s.defaultWriteObject();
        s.writeInt(size);

        // 모든 요소를 바이트 스트림으로 출력하여 직렬화한다.
        for (Entry e = head; e != null; e = e.next) {
            s.writeObject(e.data);
        }
    }

    private void readObject(ObjectInputStream s)
            throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        int numElements = s.readInt();

        // 직렬화된 모든 요소를 읽어서 리스트에 추가한다.
        for (int i = 0; i < numElements; i++) {
            add((String) s.readObject());
        }
    }

}
