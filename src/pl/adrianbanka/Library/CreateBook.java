package pl.adrianbanka.Library;

public class CreateBook {

    Book createBook (String author, String tittle) {
        Book book = new Book();
        book.author = author;
        book.title = tittle;
        return book;
    }
}
