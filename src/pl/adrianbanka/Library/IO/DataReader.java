package pl.adrianbanka.Library.IO;

import pl.adrianbanka.Library.Model.Book;

import java.util.Scanner;

public class DataReader {
    private final Scanner sc = new Scanner(System.in);

    public Book readAndCreate() {
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Autor: ");
        String author = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate = sc.nextInt();
        sc.nextLine(); // bez tego program przechodzi do wykonania kolejnej linijki
        System.out.println("Ilość stron: ");
        int pages = sc.nextInt();
        sc.nextLine();
        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }
    public void close() {
        sc.close();
    }
}
