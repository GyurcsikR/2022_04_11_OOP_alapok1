package models;

import com.sun.security.jgss.GSSUtil;

public class Music_main {
    public static void main(String[] args) {
        Author DS = new Author("Dire Straits", "Nagy-Britannia", 1977);
        Author WH = new Author("Wellhello", "Magyarország", 2014);
        Author WND = new Author("The Weeknd", "USA", 2010);

        Music music1 = new Music("Money for nothing", DS, 1985, "Pop-Rock");
        System.out.println(music1.getTrack());
        System.out.println(music1.getAuthor());
        System.out.println(music1.getPublished());
        System.out.println(music1.getGenre());
        System.out.println("-----------------------");

        Music music2 = new Music("Sultan of swing", DS, 1977, "Pop-Rock");
        System.out.println(music2.getTrack());
        System.out.println(music2.getAuthor());
        System.out.println(music2.getPublished());
        System.out.println(music2.getGenre());
        System.out.println("-----------------------");

        Music music3 = new Music("Save your tears", WND, 2020, "Synth-pop");
        System.out.println(music3.getTrack());
        System.out.println(music3.getAuthor());
        System.out.println(music3.getPublished());
        System.out.println(music3.getGenre());
        System.out.println("-----------------------");

        Music music4 = new Music("Bárhová", WH, 2020, "Pop");
        System.out.println(music4.getTrack());
        System.out.println(music4.getAuthor());
        System.out.println(music4.getPublished());
        System.out.println(music4.getGenre());


    }
}
