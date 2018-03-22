package chapter06.item32;

import java.util.Set;

// EnumSet 이용
class TextEnumSet {

    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    // 어떤 종류의 Set도 전달 가능하지만 EnumSet이 가장 좋다
    public void applyStyles(Set<Style> styles) {

    }

}
