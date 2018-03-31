package chapter10.item71;

class Main {

    // 인스턴스 필드의 정상적인 초기화
    private final FieldType fieldType = computeFieldValue();

    private static FieldType computeFieldValue() {
        return new FieldType();
    }

    // 인스턴스 필드의 늦 초기화
    private FieldType fieldType2;

    synchronized FieldType getFieldType() {
        if (fieldType2 == null) {
            fieldType2 = computeFieldValue();
        }
        return fieldType2;
    }

    // static 필드에 사용하는 늦 초기화 홀더 클래스 이디엄
    private static class FieldHolder {
        static final FieldType fieldType3 = computeFieldValue();
    }

    static FieldType getFieldType3() {
        return FieldHolder.fieldType3;
    }

    // 인스턴스 필드의 늦 초기화를 하는 이중-검사 이디엄
    private volatile FieldType fieldType4;

    FieldType getFieldType4() {
        FieldType result = fieldType4;
        if (result == null) { // 첫 번째 검사
            synchronized (this) {
                result = fieldType4;
                if (result == null) { // 두 번째 검사
                    fieldType4 = result = computeFieldValue();
                }
            }
        }
        return result;
    }

    // 단일-검사 이디엄 - 반복적인 초기화를 유발할 수 있다.
    private volatile FieldType fieldType5;

    private FieldType getFieldType5() {
        FieldType result = fieldType5;
        if (result == null) {
            fieldType5 = result = computeFieldValue();
        }
        return result;
    }

}

class FieldType {

}
