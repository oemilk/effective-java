package chapter03.item11;

class Main {

    public static void main(String[] args) {

        PhoneNumber phoneNumber = new PhoneNumber(101, 243, 4321);
        PhoneNumber phoneNumber2 = (PhoneNumber) phoneNumber.clone();
        System.out.println(phoneNumber2);

        Stack stack = new Stack();
        Stack stack2 = stack.clone();

    }

}


