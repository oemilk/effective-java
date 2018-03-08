package chapter04.item16;

import java.util.Arrays;
import java.util.HashSet;

class Main {

    public static void main(String[] args) {

        InstrumentedHashSet<String> set = new InstrumentedHashSet<>();
        set.addAll(Arrays.asList("lee", "seung", "hyun"));
        int addCount = set.getAddCount(); // 6

        System.out.println(addCount);

        InstrumentedSet<String> s = new InstrumentedSet<>(new HashSet<>(Arrays.asList()));
        s.addAll(Arrays.asList("lee", "seung", "hyun"));
        addCount = s.getAddCount();

        System.out.println(addCount);

        InstrumentedHashSet2<String> s2 = new InstrumentedHashSet2<>(new HashSet<>());
        s2.addAll(Arrays.asList("lee", "seung", "hyun"));
        addCount = s2.getAddCount(); // 3

        System.out.println(addCount);

    }

}


