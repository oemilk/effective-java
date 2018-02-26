package chapter02.item06;

import java.util.Arrays;
import java.util.EmptyStackException;

class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[-size];
        elements[size] = null; // 쓸모없는 참조를 제거한다.
        return result;
    }

    // 배열에 요소를 저장하는데 필요한 공간을 확인하고 필요할 시, 2배로 늘려준다.
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

}


