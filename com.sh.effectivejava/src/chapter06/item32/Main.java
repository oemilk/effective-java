package chapter06.item32;

import java.util.EnumSet;

class Main {

    public static void main(String[] args) {

        Text text = new Text();
        // 00000001 | 00000010 = 00000011
        text.applyStyles(Text.STYLE_BOLD | Text.STYLE_ITALIC);

        TextEnumSet textEnumSet = new TextEnumSet();
        textEnumSet.applyStyles(EnumSet.of(TextEnumSet.Style.BOLD, TextEnumSet.Style.ITALIC));

    }

}
