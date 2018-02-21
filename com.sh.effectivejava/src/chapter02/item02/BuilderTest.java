package chapter02.item02;

class BuilderTest {

    // 필수 필드
    private Object object01;
    private Object object02;
    // 만약 필수 필드가 추가 된다면?

    // 생성자
    public BuilderTest(Object o1, Object o2, Object... os) {
        object01 = o1;
        object02 = o2;
        // 만약 필수 필드가 추가 된다면?
    }

    // public static factory method
    public static BuilderTest newInstance(Object o1, Object o2, Object... os) {
        // 만약 필수 필드가 추가 된다면?
        return new BuilderTest(o1, o2, os);
    }

}


