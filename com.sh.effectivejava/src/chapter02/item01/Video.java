package chapter02.item01;

class Video {

    public Video(String s) {
        // path? name?
    }

    public static Video from(String path) {
        return new Video(path);
    }

    public static Video find(String name) {
        return new Video(name);
    }

}
