package chapter07.item41;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetList {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        // set = [-3, -2, -1, 0, 1, 2]
        // list = [-3, -2, -1, 0, 1, 2]
        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        // set = [-3, -2, -1]
        // list = [-2, 0, 2]
        for (int i = 0; i < 3; i++) {
            set.remove(i);
//            list.remove(i);
            list.remove((Integer) i);
        }

        // [-3, -2, -1] [-2, 0, 2]
        System.out.println(set + " " + list);
    }

}
