package models;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Robert Tine", "Providence (USA)", 1954);
        Author author2 = new Author("Alan Dean Foster", "New York (USA)", 1946);

        Book book1 = new Book();
        book1.setAuthor(author1);
        book1.setTitle("Virus");
        book1.setPublished(1995);
        book1.setGenre("Thriller");

        System.out.println(book1.getAuthor());
        System.out.println(book1.getTitle());
        System.out.println(book1.getPublished());
        System.out.println(book1.getGenre());
        System.out.println("---------------------");

        Book book2 = new Book(author2, "Aliens", 2015, "Sci-fi");

        System.out.println(book2.getAuthor());
        System.out.println(book2.getTitle());
        System.out.println(book2.getPublished());
        System.out.println(book2.getGenre());

        Book book3 = new Book(author2, "Star Wars", 1976, "Sci-fi");
        Book book4 = new Book(author2, "Transformers - a múlt árnyai", 2007, "Sci-fi");
        Book book5 = new Book(author2, "Terminátor - megváltás", 2009, "Sci-fi");
    }
}
