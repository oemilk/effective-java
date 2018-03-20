package chapter05.item29;

import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) {
        Map<Class, Object> map = new HashMap<>();
        map.put(String.class, "test");
        map.put(Integer.class, 0);
        map.put(Class.class, Favorities.class);

        String i = (String) map.get(Integer.class);
        String s = (String) map.get(String.class);
        Favorities f = (Favorities) map.get(Favorities.class);

        Favorities favorities = new Favorities();
        favorities.putFavorite(String.class, "test");
        favorities.putFavorite(Integer.class, 0);
        favorities.putFavorite(Class.class, Favorities.class);

        String favoriteString = favorities.getFavorite(String.class); // test
        Integer favoriteInteger = favorities.getFavorite(Integer.class); // 0
        Class<?> favoriteClass = favorities.getFavorite(Class.class); // Favorities
    }

}
