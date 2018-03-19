package chapter05.item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Main {

    // 원천 타입을 이용 - 바람직 하지 않음
    public static Set union2(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // 제네릭 메서드
    public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    // 재귀적 타입 바운드를 이용해서 상호 비교를 표현
    public static <T extends Comparable<T>> T max(List<T> list) {
        Iterator<T> i = list.iterator();
        T result = i.next();
        while (i.hasNext()) {
            T t = i.next();
            if (t.compareTo(result) > 0) {
                result = t;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Set<String> os = new HashSet<>(Arrays.asList("O", "P", "N"));
        Set<String> os2 = new HashSet<>(Arrays.asList("A", "D", "W"));
        Set<String> android = union(os, os2); // [P, A, D, W, N, O]
        System.out.println(android);
    }

}
