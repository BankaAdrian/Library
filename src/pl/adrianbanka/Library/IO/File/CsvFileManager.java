package pl.adrianbanka.Library.IO.File;

import pl.adrianbanka.Library.Exceptions.DataExportException;
import pl.adrianbanka.Library.Exceptions.DataImportException;
import pl.adrianbanka.Library.Exceptions.InvalidDataException;
import pl.adrianbanka.Library.Model.Book;
import pl.adrianbanka.Library.Model.Library;
import pl.adrianbanka.Library.Model.Magazine;
import pl.adrianbanka.Library.Model.Publication;

import java.io.*;
import java.util.Scanner;

public class CsvFileManager implements FileManager {
    private static final String FILE_NAME = "Library.csv";

    @Override
    public Library importData() throws IOException {
        Library library = new Library();
        try(Scanner fileReader = new Scanner(new File(FILE_NAME))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                Publication publication = createObjectFromString(line);
            }
        } catch (FileNotFoundException e) {
            throw new DataImportException("Brak pliku " + FILE_NAME);
        }
        return library;
    }

    private Publication createObjectFromString(String line) {
        String[] split = line.split(";");
        String type = split[0];
        if (Book.TYPE.equals(type)) {
            return createBook(split);
        } else if(Magazine.TYPE.equals(type)) {
            return createMagazine(split);
        }
        throw new InvalidDataException("Nieznany typ publikacji" + type);
    }

    private Publication createMagazine(String[] data) {
        String title = data[1];
        String publisher = data[2];
        int year = Integer.valueOf(data[3]);
        int month = Integer.valueOf(data[4]);
        int day = Integer.valueOf(data[5]);
        String language = data[6];
        return new Magazine(title, publisher, language, year, month, day);
    }

    private Publication createBook(String[] data) {
        String title = data[1];
        String publisher = data[2];
        int year = Integer.valueOf(data[3]);
        String author = data[4];
        int pages = Integer.valueOf(data[5]);
        String isbn = data[6];
        return new Book(title, author, year, pages, publisher, isbn);
    }


    @Override
    public void exportData(Library library) {
        Publication[] publications = library.getPublications();
        try (var fileWriter = new FileWriter(FILE_NAME);
        var bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Publication publication : publications) {
                bufferedWriter.write(publication.toCsv());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new  DataExportException("B????d zapisu danych do pliku " + FILE_NAME);
        }
    }
}
