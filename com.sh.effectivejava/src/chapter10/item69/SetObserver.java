package chapter10.item69;

public interface SetObserver<E> {

    // 요소가 Set에 추가될 때 호출된다.
    void added(ObservableSet<E> set, E element);

}
