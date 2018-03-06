package chapter03.item12;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Main {

    public static void main(String[] args) {

        String[] strs = {"ss", "a", "f", "bew"};

        Set<String> s = new TreeSet<>();
        Collections.addAll(s, strs);
        System.out.println(s);

        HashSet<BigDecimal> set = new HashSet<>();
        set.add(new BigDecimal("1.0"));
        set.add(new BigDecimal("1.00"));
        for (BigDecimal bigDecimal : set) {
            System.out.println(bigDecimal); // 1.0 and 1.00
        }

        TreeSet<BigDecimal> set2 = new TreeSet<>();
        set2.add(new BigDecimal("1.0"));
        set2.add(new BigDecimal("1.00"));
        for (BigDecimal bigDecimal : set2) {
            System.out.println(bigDecimal); // 1.0
        }

        CaseInsensitiveString string = new CaseInsensitiveString("b");
        CaseInsensitiveString string2 = new CaseInsensitiveString("a");

        TreeSet<CaseInsensitiveString> set3 = new TreeSet<>(
                new Comparator<CaseInsensitiveString>() {
                    @Override
                    public int compare(CaseInsensitiveString o1, CaseInsensitiveString o2) {
                        // do something
                        return 0;
                    }
                });
        set3.add(string);
        set3.add(string2);
        for (CaseInsensitiveString insensitiveString : set3) {
            System.out.println(insensitiveString); // a and b
        }

        TreeSet<CaseInsensitiveString> set4 = new TreeSet<>();
        set4.add(string);
        set4.add(string2);
        for (CaseInsensitiveString insensitiveString : set4) {
            System.out.println(insensitiveString); // a and b
        }

    }

}


