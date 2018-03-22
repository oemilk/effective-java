package chapter06.item33;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Main {

    public static void main(String[] args) {

        Herb[] garden = {new Herb("Basil", Herb.Type.ANNUAL),
                new Herb("Dill", Herb.Type.ANNUAL),
                new Herb("Lavendar", Herb.Type.PERENNIAL),
                new Herb("Rosemary", Herb.Type.BIENNIAL)};
//
//        // Herb.Type.ordinal()로 인덱싱 된다
//        Set<Herb>[] herbsByType = (Set<Herb>[]) new Set[Herb.Type.values().length];
//        for (int i = 0; i < herbsByType.length; i++) {
//            herbsByType[i] = new HashSet<>();
//        }
//
//        for (Herb h : garden) {
//            herbsByType[h.type.ordinal()].add(h);
//        }
//
//        for (int i = 0; i < herbsByType.length; i++) {
//            System.out.printf("%s : %s%n", Herb.Type.values()[i], herbsByType[i]);
//        }

        // EnumMap을 이용해서 데이터를 enum과 연관시킨다
        Map<Herb.Type, Set<Herb>> herbsByType = new EnumMap<>(Herb.Type.class);

        for (Herb.Type type : Herb.Type.values()) {
            herbsByType.put(type, new HashSet<>());
        }

        for (Herb h : garden) {
            herbsByType.get(h.type).add(h);
        }

        System.out.println(herbsByType);

    }

}
