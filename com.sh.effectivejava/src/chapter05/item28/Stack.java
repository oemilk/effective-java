package chapter05.item28;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

public class Stack<E> {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    // elements 배열은 push(E) 메서드를 통해서만 E 인스턴스를 저장한다.
    // 따라서 타입 안전은 충분히 확인된다.
    // 그러나 elements 배열의 런타임 타입은 E[]가 아닌 Object[]가 될 것이다.
    @SuppressWarnings("unchecked")
    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    // 와일드 카드 타입
    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        // push 메서드에서는 E 타입의 elements 배열 요소만을 받으므로
        // (E) 캐스팅 하는 것이 맞다.
        @SuppressWarnings("unchecked")
        E result = (E) elements[--size];
        elements[size] = null;
        return result;
    }

    // 와일드 카드 타입
    public void popAll(Collection<? super E> dst) {
        while(!isEmpty()) {
            dst.add(pop());
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

}
