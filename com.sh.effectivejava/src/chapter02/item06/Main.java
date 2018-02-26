package chapter02.item06;

class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push("String");
        stack.push(new Boolean("true"));
        stack.push("test");

        stack.pop();
        stack.pop();

    }

}


