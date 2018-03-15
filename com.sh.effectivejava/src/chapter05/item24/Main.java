package chapter05.item24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Main {

    int size = 5;
    Object[] elements = new Object[0];

    // @SuppressWarning 주석의 범위를 줄이기 위해 지역 변수를 선언합니다.
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            // 우리가 생성하는 배열이 인자로 전달된 것(T[])과
            // 같은 타입이므로 이렇게 캐스팅 하는 것이 적법하다.
            @SuppressWarnings("unchecked")
            T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
            return result;
        }

        System.arraycopy(elements, 0, a, 0, size);

        if (a.length > size) {
            a[size] = null;
        }

        return a;
    }

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet();
        stringSet = new HashSet<>();
    }

}
