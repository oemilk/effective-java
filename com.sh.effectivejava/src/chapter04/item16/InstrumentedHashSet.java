package chapter04.item16;

import java.util.Collection;
import java.util.HashSet;

// 상속을 잘못 이용한 예시
public class InstrumentedHashSet<E> extends HashSet<E> {

    // 요소를 추가했던 횟수 (HashSet의 현재 크기가 아닌, 정말로 추가를 했던 횟수)
    private int addCount = 0;

    public InstrumentedHashSet() {}

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

}

