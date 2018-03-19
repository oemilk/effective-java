package chapter05.item26;

import java.util.Arrays;
import java.util.EmptyStackException;

// 제네릭화 된 최초 버전의 Stack - 컴파일 되지 않는다
public class GenericStack<E> {

//    private E[] elements;
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    // elements 배열은 push(E) 메서드를 통해서만 E 인스턴스를 저장한다.
    // 따라서 타입 안전은 충분히 확인된다.
    // 그러나 elements 배열의 런타임 타입은 E[]가 아닌 Object[]가 될 것이다.
    @SuppressWarnings("unchecked")
    public GenericStack() {
//        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
//        elements = new E[DEFAULT_INITIAL_CAPACITY];
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

//        E result = elements[--size];
        // push 메서드에서는 E 타입의 elements 배열 요소만을 받으므로
        // (E) 캐스팅 하는 것이 맞다.
        @SuppressWarnings("unchecked")
        E result = (E) elements[--size];
        elements[size] = null;
        return result;
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
