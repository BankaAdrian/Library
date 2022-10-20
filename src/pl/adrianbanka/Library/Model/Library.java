package pl.adrianbanka.Library.Model;

public class Library {

    private static final int MAX_BOOKS = 1000;
    private static final int MAX_MAGAZINES = 1000;
    Book[] books = new Book[MAX_BOOKS];
    Magazine[] magazines = new Magazine[MAX_MAGAZINES];
    private int bookNumber = 0;
    private int magazineNumber = 0;

    public void addBook(Book book) {
        if (bookNumber < MAX_BOOKS) {
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

    public void addMagazine(Magazine magazine) {
        if (magazineNumber < MAX_MAGAZINES) {
            magazines[magazineNumber] = magazine;
            magazineNumber++;
        } else {
            System.out.println("Nie można dodać więcej czasopism do biblioteki!");
        }
    }

    public void printMagazines() {
        if (magazineNumber == 0) {
            System.out.println("Biblioteka jest pusta.");
        }
        for (int i = 0; i < magazineNumber; i++) {
            magazines[i].printInfo();

        }
    }
}
