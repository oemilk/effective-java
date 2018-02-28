package chapter03.item08;

// 대칭성에 위반된다.
public class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        if (s == null) {
             throw new NullPointerException();
        }
        this.s = s;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof CastInsensitiveString) {
//            return s.equalsIgnoreCase(((CastInsensitiveString) obj).s);
//        }
//
//        // 한 쪽으로만 상호 운용 된다.
//        if (obj instanceof String) {
//            return s.equalsIgnoreCase((String) obj);
//        }
//
//        return false;
//    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseInsensitiveString
                && ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
    }

}
