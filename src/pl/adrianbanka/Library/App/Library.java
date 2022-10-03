package pl.adrianbanka.Library.App;

import pl.adrianbanka.Library.Model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v.06";

        Book[] books = new Book[1000];

        books[0] = new Book("w pustyni sie dupcza", "heniek", 1992, 450, "nie wiem", "3434");
        books[0].printInfo();

        books[1] = new Book("chujnia", "brak autora", 1993, 32, "major");
        books[1].printInfo();


    }
}
