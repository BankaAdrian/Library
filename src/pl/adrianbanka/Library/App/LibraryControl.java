package pl.adrianbanka.Library.App;


import pl.adrianbanka.Library.IO.DataReader;
import pl.adrianbanka.Library.Model.Book;
import pl.adrianbanka.Library.Model.Library;
import pl.adrianbanka.Library.Model.Magazine;

public class LibraryControl {

    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int PRINT_BOOK = 2;
    private static final int ADD_MAGAZINE = 3;
    private static final int PRINT_MAGAZINES = 4;

    private final DataReader dataReader = new DataReader();
    private final Library library = new Library();

    public void controlLoop() {
        int option;
        do {
            printOptions();
            option = dataReader.getInt();

            switch (option) {
                case ADD_BOOK -> addBook();
                case PRINT_BOOK -> printBooks();
                case ADD_MAGAZINE -> addMagazine();
                case PRINT_MAGAZINES -> printMagazine();
                case EXIT -> exit();
                default -> System.out.println("Wybrano błędną opcję.");
            }
        } while (option != EXIT);
    }

    private void printMagazine() {
        library.printMagazines();
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void exit() {
        System.out.println("Koniec programu.");
    }

    private void printBooks() {
        library.printBooks();
        dataReader.close();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję.");
        System.out.println(EXIT + " - wyjście z programu.");
        System.out.println(ADD_BOOK + " - dodanie nowej książki.");
        System.out.println(PRINT_BOOK + " - wyświetl dostępne książki.");
        System.out.println(ADD_MAGAZINE + " - dodanie nowego magazynu.");
        System.out.println(PRINT_MAGAZINES + " - wyświetlenie nowego magazynu.");
    }

}
