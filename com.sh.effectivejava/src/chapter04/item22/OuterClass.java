package chapter04.item22;

import java.util.Arrays;
import java.util.Comparator;

// 외곽(enclosing) 클래스
class OuterClass {

    private int id = 0;
    private static boolean flag = true;

    // 중첩 클래스(nested class), 내부 클래스(inner class)
    // static 멤버 클래스
    static class StaticInnerClass {

        void operation() {
            boolean f = flag; // access
        }

    }

    // static이 아닌 멤버 클래스
    class InnerClass {

        void operation() {
            int o = id; // access
        }

    }

    void doSomething() {

        // 익명 클래스
        Arrays.sort(new String[]{"a", "e", "c", "b"},
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return 0;
                    }
                });

        // 지역 클래스
        class localClass {

            void operation() {
                int o = id; // access
            }

        }

    }

}
