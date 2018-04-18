package chapter09.item64;

import com.sun.istack.internal.NotNull;

import java.util.EmptyStackException;
import java.util.Map;
import java.util.TreeMap;

class Main {

    public static Object pop(Object[] objects) {
        int size = objects.length;
        if (size == 0) {
            throw new EmptyStackException();
        }

        Object result = objects[--size];
        objects[size] = null;
        return result;
    }

    public static void add(String key, Object item) {
        if (!(item instanceof Integer)) {
            throw new ClassCastException(item.toString());
        }

        Map<String, Integer> map = new TreeMap<>();
        map.put(key, (Integer) item);
    }

    private static String first = "first";
    private static String second = "second";

    public static void copy(@NotNull String s) {
        String tempFirst = s.split(":")[0];
        String tempSecond = s.split(":")[1];
        first = tempFirst;
        second = tempSecond;

        System.out.println(first + ", " + second);
    }

    public static void main(String[] args) {

        pop(null);
        add("test", "test");
        copy("");

    }

}
