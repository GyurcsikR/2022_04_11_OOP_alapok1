package models;

public class Book {
   private Author author;
   private String title;
   private int published;
   private String genre;

   public Book() {}

   public Book(Author author, String title, int published, String genre){
       this.author = author;
       this.title = title;
       this.published = published;
       this.genre = genre;
   }

   public Author getAuthor(){
       return author;
   }
   public void setAuthor(Author author) {
        this.author = author;
   }
   public String getTitle(){
       return title;
   }
   public void setTitle(String title){
       this.title = title;
   }
   public int getPublished(){
       return published;
   }
   public void setPublished(int published){
       this.published = published;
   }
   public String getGenre(){
       return genre;
   }
   public void setGenre(String genre){
       this.genre = genre;
   }


}
