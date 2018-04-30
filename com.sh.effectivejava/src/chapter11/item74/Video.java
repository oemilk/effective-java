package chapter11.item74;

import java.io.Serializable;

class Video implements Serializable {

    static final long serialVersionUID = 1L;

    private String url;
    private String title;

    Video(String url, String title) {
        this.url = url;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

}
