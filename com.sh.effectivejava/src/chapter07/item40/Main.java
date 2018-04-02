package chapter07.item40;

import java.util.ArrayList;
import java.util.List;

class Main {

    //    public static void putHelper(
//            int age, String firstName, String lastName,
//            String job, String etc) {
//        //
//    }

    public static void putHelper(Helper helper) {
        //
    }

    public static void setPlayer(boolean isLive) {
        if (isLive) {
            // set live player
        } else {
            // set not live player
        }
    }

    public enum Type {LIVE, VOD, MOVIE}

    public static void setPlayer(Type type) {
        switch (type) {
            case LIVE:
                // set live player
                break;
            case VOD:
                // set vod player
                break;
            case MOVIE:
                // set movie player
                break;
        }
    }

    public static void main(String[] args) {

//        no method
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("b");
//        list.add("f");
//
//        int fromIndex = 1;
//        int toIndex = 3;
//        String s = "b";
//
//        int lastIndex = list.getLastIndexFromSubList(fromIndex, toIndex, s);

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("b");
        list.add("f");

        int fromIndex = 1;
        int toIndex = 3;
        String s = "b";

        List<String> newList = list.subList(fromIndex, toIndex);
        int lastIndex = newList.lastIndexOf(s);

    }

    class Helper {

        int age = 13;
        String firstName = "test";
        String lastName = "case";
        String job = "developer";
        String etc = "...";

    }

}
