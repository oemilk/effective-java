package chapter05.item26;

class Main {

    // 제네릭 Stack 클래스를 이용하는 간단한 예
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        for (String s : args) {
            stack.push(s);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toUpperCase());
        }
    }

}
