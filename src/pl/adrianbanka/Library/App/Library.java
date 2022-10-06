package pl.adrianbanka.Library.App;

import pl.adrianbanka.Library.IO.DataReader;
import pl.adrianbanka.Library.Model.Book;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v.07";


        Book[] books = new Book[1000];
        DataReader dataReader = new DataReader();
        books[0] = dataReader.readAndCreate();
        books[1] = dataReader.readAndCreate();
        dataReader.close();


        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        books[0].printInfo();
        books[1].printInfo();


    }
}
