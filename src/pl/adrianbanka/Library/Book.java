package pl.adrianbanka.Library;

public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    void getInfo() {
        System.out.println(title + author);
    }

}
