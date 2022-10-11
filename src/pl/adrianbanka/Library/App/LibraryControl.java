package pl.adrianbanka.Library.App;


import pl.adrianbanka.Library.IO.DataReader;
import pl.adrianbanka.Library.Model.Book;
import pl.adrianbanka.Library.Model.Library;

public class LibraryControl {

    private final int exit = 0;
    private final int addBook = 1;
    private final int printBook = 2;

    private final DataReader dataReader = new DataReader();
    private final Library library = new Library();

    public void controlLoop() {
        int option;
        do {
            printOptions();
            option = dataReader.getInt();

            switch (option) {
                case addBook -> addBook();
                case printBook -> printBooks();
                case exit -> exit();
                default -> System.out.println("Wybrano błędną opcję.");
            }
        } while (option != exit);
    }

    private void exit() {
        System.out.println("Koniec programu.");
    }

    private void printBooks() {
        library.printBooks();
        dataReader.close();
    }

    private void addBook() {
        Book book = dataReader.readAndCreate();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję.");
        System.out.println(exit + " - wyjście z programu.");
        System.out.println(addBook + " - dodanie nowej książki.");
        System.out.println(printBook + " - wyświetl dostępne książki.");
    }

}
