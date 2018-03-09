package chapter04.item17;

import java.util.Date;

public class Sub extends Super {

    private final Date date;

    Sub() {
        date = new Date();
    }

    @Override
    public void overideMe() {
        System.out.println(date);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overideMe();
    }

}
