package models;

public class Music {
    private String track;
    private Author author;
    private int published;
    private String genre;

    public Music() {}

    public Music(String track, Author author, int published, String genre){
        this.track = track;
        this.author = author;
        this.published = published;
        this.genre = genre;
    }

    public String getTrack(){
        return track;
    }
    public void setTrack(String track) {
        this.track = track;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public int getPublished() {
        return published;
    }
    public void setPublished(int published) {
        this.published = published;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
}
