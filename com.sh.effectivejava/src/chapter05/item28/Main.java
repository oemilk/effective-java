package chapter05.item28;

import java.util.Collection;

class Main {

    public static void main(String[] args) {

        Iterable<Integer> integers = () -> null;
        Stack<Integer> integerStack = new Stack<>();
        integerStack.pushAll(integers);

        Stack<Number> numberStack = new Stack<>();
        numberStack.pushAll(integers);


        Collection<Object> objects = null; // temp
        Stack<Object> objectStack = new Stack<>();
        objectStack.popAll(objects);

        Stack<Number> numberStack2 = new Stack<>();
        numberStack2.popAll(objects);

    }

}
