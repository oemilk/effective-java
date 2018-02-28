package chapter03.item09;

import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) {

        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(101, 243, 4321), "SeungHyun");
        m.get(new PhoneNumber(101, 243, 4321)); // null

        System.out.println(m.get(new PhoneNumber(101, 243, 4321)));
    }

}


