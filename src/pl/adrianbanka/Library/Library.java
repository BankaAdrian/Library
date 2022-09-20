package pl.adrianbanka.Library;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v.04";

        Book book1 = new Book("w pustyni sie dupcza", "heniek", 1992, 450, "nie wiem", "3434");
        book1.printInfo();

        Book book = new Book("chujnia", "brak autora", 1993, 32, "major");
        book.printInfo();


    }
}
