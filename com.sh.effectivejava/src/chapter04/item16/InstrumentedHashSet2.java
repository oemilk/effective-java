package chapter04.item16;

import java.util.Collection;
import java.util.HashSet;

public class InstrumentedHashSet2<E> {

    // 요소를 추가했던 횟수
    private int addCount = 0;

    private final HashSet<E> set;

    public InstrumentedHashSet2(HashSet<E> set) {
        this.set = set;
    }

    public void addAll(Collection<? extends E> c) {
        addCount += c.size();
        set.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

}

