package chapter04.item22;

import java.util.AbstractSet;
import java.util.Iterator;

// static이 아닌 멤버 클래스의 이용 예
public class MySet<E> extends AbstractSet<E> {

    private int size = 10;
    private E[] datas = (E[]) new Object[size];

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    @Override
    public int size() {
        return size;
    }

    private class MyIterator implements Iterator<E> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return size > 0;
        }

        @Override
        public E next() {
            index++;
            return datas[index];
        }
    }

}
