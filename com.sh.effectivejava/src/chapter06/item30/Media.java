package chapter06.item30;

// 데이터와 메서드를 갖는 enum 타입
public enum Media {

    LIVE("실시간", true),
    VOD("VOD", false),
    MOVIE("영화", false);

    private final String name;
    private final boolean isFree;

    // 생성자
    Media(String name, boolean isFree) {
        this.name = name;
        this.isFree = isFree;
    }

    public String getName() {
        return name;
    }

    public boolean isFree() {
        return isFree;
    }

}
