package chapter05.item23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {

    public static void main(String[] args) {
        List strings = new ArrayList();
        strings.add("test");
        Integer i = (Integer) strings.get(0); // ClassCastException 발생

        List<String> strings2 = new ArrayList<>();
        strings2.add("test");
//        Integer i = (Integer) strings2.get(0); // Compile 에러 발생
        
        List<String> strings3 = new ArrayList<>();
        unsafeAdd(strings3, new Integer(18));
        String s = strings3.get(0);

        Set<String> s1 = new HashSet<>();
        s1.add("test");

        Set<Integer> s2 = new HashSet<>();
        s2.add(1);

        numElementsInCommon(s1, s2);
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o); // warning: unchecked call to add(E) in raw type list
    }

//    private static void unsafeAdd(List<Object> list, Object o) {
//        list.add(o); // Complie 에러 발생
//    }

//    private static void unsafeAdd(List<?> list, Object o) {
//        list.add(o); // Complie 에러 발생
//    }


//    private static int numElementsInCommon(Set s1, Set s2) {
//        int result = 0;
//        for (Object o1 : s1) {
//            if (s2.contains(o1)) {
//                result++;
//            }
//        }
//        return result;
//    }

    private static int numElementsInCommon(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                result++;
            }
        }
        return result;
    }

}
