package pl.adrianbanka.Library.IO;

import pl.adrianbanka.Library.Model.Book;
import pl.adrianbanka.Library.Model.Magazine;

import java.util.Scanner;

public class DataReader {
    private final Scanner sc = new Scanner(System.in);

    public Book readAndCreateBook() {
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Autor: ");
        String author = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        System.out.println("ISBN: ");
        int year = sc.nextInt();
        System.out.println("Rok wydania: ");
        String publisher = sc.nextLine();
        System.out.println("Ilość stron: ");
        int pages = getInt();
        return new Book(title, author, year, pages, publisher);
    }
    public Magazine readAndCreateMagazine() {
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("Język: ");
        String language = sc.nextLine();
        System.out.println("Rok wydania: ");
        int year = getInt();
        System.out.println("Miesiąc: ");
        int month = getInt();
        System.out.println("Dzień: ");
        int day = getInt();
        return new Magazine(day, publisher, language, year, month, title);
    }
    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }
    public void close() {
        sc.close();
    }
}
