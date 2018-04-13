package chapter08.item50;

class ThreadLocal {

    // 인스턴스 생성 방지
    private ThreadLocal() {}

    // 역량(Capability)
    public static class Key {
        Key() {}
    }

    // 유일하고 위조 불가능한 키를 생성
    public static Key getKey() {
        return new Key();
    }

    // 명명된 변수의 현재 스레드 값을 설정
    public static void set(Key key, Object value) {
        //
    }

    // 명명된 변수의 현재 스레드 값을 반환
    public static Object get(Key key) {
        // temp
        return null;
    }

}