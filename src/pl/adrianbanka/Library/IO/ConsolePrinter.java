package pl.adrianbanka.Library.IO;

import pl.adrianbanka.Library.Model.Book;
import pl.adrianbanka.Library.Model.Magazine;
import pl.adrianbanka.Library.Model.Publication;

public class ConsolePrinter {
    public void printBooks(Publication[] publications) {
        int countBooks = 0;
        for (Publication publication : publications) {
            if (publication instanceof Book) {
                System.out.println(publications);
                countBooks++;
            }
        }
        if (countBooks == 0) {
            printLine("Brak książek w bibliotece");
        }
    }

    public void printMagazines(Publication[] publications) {
        int countMagazines = 0;
        for (Publication publication : publications) {
            if (publication instanceof Magazine) {
                System.out.println(publications);
                countMagazines++;
            }
        }
        if (countMagazines == 0) {
            printLine("Brak magazynów w bibliotece");
        }
    }
    public void printLine(String text) {
        System.out.println(text);
    }
}
