package chapter06.item36;

import java.util.HashSet;
import java.util.Set;

class Main {

    public static void main(String[] args) {
        Set<Name> s = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            s.add(new Name("SH", "Lee"));
        }

        System.out.println(s.size()); // 1
    }

}
