package chapter08.item45;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import chapter06.item33.Herb;

class Main {

    public void test() {
        int age = 22;
        String name = "sh";
        String birth = "1111.11.11";

        // use age
        // use name
        // use birth
    }

    public void test2() {
        int age = 22;
        // use age

        String name = "sh";
        // use name

        String birth = "1111.11.11";
        // use birth
    }

    public void test3() {
        Herb herb;
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        herb = new Herb("Ssuk", null);
    }

    public void testLoop() {

        List<String> list = new ArrayList<>();

        for (String s : list) {
            doSomething(s);
        }

        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            doSomething(i.next());
        }

    }

    private void doSomething(String s) {
        // do work with s
    }

    public static void main(String[] args) {

    }

}
