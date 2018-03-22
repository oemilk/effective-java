package chapter06.item32;

// 비트 필드 enum 상수들
class Text {

    public static final int STYLE_BOLD = 1 << 0; // 1 // 00000001
    public static final int STYLE_ITALIC = 1 << 1; // 2 // 00000010
    public static final int STYLE_UNDERLINE = 1 << 2; // 4 // 00000100
    public static final int STYLE_STRIKETHROUGH = 1 << 3; // 8 // 00001000

    // 매개 변수는 하나 이상의 STYLE_ 상수를 비트 OR 연산한 것이다
    public void applyStyles(int styles) {

    }

}
