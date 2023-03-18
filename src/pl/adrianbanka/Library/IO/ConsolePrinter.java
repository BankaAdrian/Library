package pl.adrianbanka.Library.IO;

import pl.adrianbanka.Library.Model.Book;
import pl.adrianbanka.Library.Model.LibraryUser;
import pl.adrianbanka.Library.Model.Magazine;
import pl.adrianbanka.Library.Model.Publication;

import java.util.Collection;

public class ConsolePrinter {
    public void printBooks(Collection<Publication> publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if(publication instanceof Book) {
                printLine(publication.toString());
                counter++;
            }
        }
        if (counter == 0)
            printLine("Brak książek w bibliotece");
    }

    public void printMagazines(Collection<Publication> publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if(publication instanceof Magazine) {
                printLine(publication.toString());
                counter++;
            }
        }
        if (counter == 0)
            printLine("Brak magazynów w bibliotece");
    }
    public void prinstUsers(Collection<LibraryUser> users) {
        for (LibraryUser user : users) {
            printLine(user.toString());
        }
    }

    public void printLine(String text) {
        System.out.println(text);
    }
}