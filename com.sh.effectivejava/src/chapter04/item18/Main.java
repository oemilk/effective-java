package chapter04.item18;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Main {

    // 인터페이스를 이용한 List 인터페이스 구현 메서드
    static List<Integer> intArrayAsListByInterface(final int[] a) {
        if (a == null) {
            throw new NullPointerException();
        }

        return new List<>() {
            @Override
            public Integer get(int index) {
                return a[index]; // Autoboxing
            }

            @Override
            public Integer set(int index, Integer val) {
                int oldVal = a[index];
                a[index] = val; // Auto-unboxing
                return oldVal; // Autoboxing
            }

            @Override
            public int size() {
                return a.length;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public void add(int index, Integer element) {

            }

            @Override
            public Integer remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Integer> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Integer> listIterator(int index) {
                return null;
            }

            @Override
            public List<Integer> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }

    // 골격 구현 추상 클래스를 이용한 List 인터페이스 구현 메서드
    static List<Integer> intArrayAsList(final int[] a) {
        if (a == null) {
            throw new NullPointerException();
        }

        return new AbstractList<>() {
            @Override
            public Integer get(int index) {
                return a[index]; // Autoboxing
            }

            @Override
            public Integer set(int index, Integer val) {
                int oldVal = a[index];
                a[index] = val; // Auto-unboxing
                return oldVal; // Autoboxing
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        List<Integer> list = intArrayAsList(array);
        list.add(3);

    }

}


