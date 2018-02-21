package chapter02.item03;

public class SingletonField {

    public static final SingletonField INSTANCE = new SingletonField();

    private SingletonField() {}

    public void testMethod() {}

}
