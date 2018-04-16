package chapter08.item52;

import java.util.Arrays;
import java.util.Set;

class Main {

    // 리플렉션으로 인스턴스 생성 후 인터페이스를 통해 사용하기
    public static void main(String[] args) {

        // 클래스 이름을 Class 객체로 변환한다
        Class<?> cl = null;

        try {
            cl = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found.");
            System.exit(1);
        }

        // 클래스 인터페이스를 생성한다
        Set<String> s = null;
        try {
            s = (Set<String>) cl.newInstance();
        } catch (IllegalAccessException e) {
            System.err.println("Class not accessible.");
            System.exit(1);
        } catch (InstantiationException e) {
            System.err.println("Class not instantiable.");
            System.exit(1);
        }

        // Set의 요소를 출력한다
        s.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(s);
    }

}
