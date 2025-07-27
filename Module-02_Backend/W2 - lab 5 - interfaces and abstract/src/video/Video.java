package video;

public abstract class Video {
    protected String title;
    protected int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getInfo() {
        return "Title: " + title + ", Duration: " + duration + " minutes";
    }
}