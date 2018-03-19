package chapter05.item25;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        // 런타임 에러 발생
        Object[] objects = new Long[1];
        objects[0] = "gogogo"; // ArrayStoreException 예외 발생

        // 컴파일 에러 발생
//        List<Object> list = new ArrayList<Long>();
//        list.add("gogogo");

        // Generic array creation
//        List<String>[] stringLists = new List<String>[1];
    }

}
