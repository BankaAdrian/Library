package pl.adrianbanka.Library.Model;

public class Library {

    private final int maxBooks = 1000;
    Book[] books = new Book[maxBooks];
    private int bookNumber = 0;

    public void addBook(Book book) {
        if(bookNumber < maxBooks) {
            books[bookNumber] = book;
            bookNumber++;
        } else {
            System.out.println("Nie można dodać więcej książek do biblioteki!");
        }
    }
    public void printBooks() {
        if (bookNumber == 0) {
            System.out.println("Biblioteka jest pusta.");
        }
        for (int i = 0; i < bookNumber; i++) {
            books[i].printInfo();
            
        }
    }
}
