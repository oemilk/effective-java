package chapter08.item46;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class Main {

    public static void test(int a[]) {

        for (int i = 0; i < a.length; i++) {
            doSomething(i);
        }

        for (int i : a) {
            doSomething(i);
        }

    }

    private enum CP {SBS, KBS, MBC, JTBC}
    private enum TYPE {LIVE, QVOD, VOD, MOVIE, CLIP}

    public static void test2() {

        Collection<CP> cps = Arrays.asList(CP.values());
        Collection<TYPE> types = Arrays.asList(TYPE.values());

        for (Iterator<CP> i = cps.iterator(); i.hasNext();) {
            for (Iterator<TYPE> j = types.iterator(); j.hasNext();) {
                System.out.println(i.next() + ", " + j.next());
            }
        }

        for (Iterator<CP> i = cps.iterator(); i.hasNext();) {
            CP cp = i.next();
            for (Iterator<TYPE> j = types.iterator(); j.hasNext();) {
                System.out.println(cp + ", " + j.next());
            }
        }

        for (CP cp : cps) {
            for (TYPE type : types) {
                System.out.println(cp + ", " + type);
            }
        }

    }

    private static void doSomething(int i) {
        // do work with i
    }

    public static void main(String[] args) {
        test2();
    }

}
