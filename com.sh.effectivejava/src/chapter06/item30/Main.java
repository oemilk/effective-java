package chapter06.item30;

class Main {

    // int enum 패턴 - 너무 빈약 함
    public static final int MEDIA_LIVE = 0;
    public static final int MEDIA_VOD = 1;
    public static final int MEDIA_MOVIE = 2;

    public static final int DEVIE_ANDROID = 0;
    public static final int DEVIE_IOS = 1;
    public static final int DEVIE_PC = 2;

    public static int CURRENT_MEDIA;

    public enum Media {LIVE, VOD, MOVIE};
    public enum Device {ANDROID, IOS, PC};

    public static Media CURRENT_MEDIA2;

    public static chapter06.item30.Media CURRENT_MEDIA3;

    public static void main(String[] args) {

        // DEVICE_ANDROID is not media type
        if (CURRENT_MEDIA == DEVIE_ANDROID) {
            // ...
        }

        // compile error
        if (CURRENT_MEDIA2 == Media.LIVE) {
            // ...
        }

        for (chapter06.item30.Media media : chapter06.item30.Media.values()) {
            if (media.isFree()) {
                System.out.println(media.getName()); // 실시간
            }
        }

    }

}
