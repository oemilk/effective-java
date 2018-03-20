package chapter05.item29;

import java.util.HashMap;
import java.util.Map;

// 타입 안전이 보장되는 혼성 컨테이너 패턴
public class Favorities {

    private Map<Class<?>, Object> favorities = new HashMap<>();

    public <T> void putFavorite(Class<T> type, T instance) {
        if (type == null) {
            throw new NullPointerException("Type is null");
        }
        favorities.put(type, instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorities.get(type));
    }

}
