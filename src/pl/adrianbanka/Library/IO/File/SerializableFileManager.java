package pl.adrianbanka.Library.IO.File;

import pl.adrianbanka.Library.Exceptions.DataExportException;
import pl.adrianbanka.Library.Model.Library;

import java.io.*;

public class SerializableFileManager implements FileManager {
    private static final String FILE_NAME = "Library.o";

    @Override
    public Library importData() {
        try (
            var fis = new FileInputStream(FILE_NAME);
            var ois = new ObjectInputStream(fis);
            ) {
            return (Library) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new DataExportException("Brak pliku " + FILE_NAME);
        } catch (IOException e) {
            throw new DataExportException("Błąd odczytu pliku " + FILE_NAME);
        } catch (ClassNotFoundException e) {
            throw new DataExportException("Niezgodny typ danych z pliku " + FILE_NAME);
        }
    }

    @Override
    public void exportData(Library library) {
        try (
            var fos = new FileOutputStream(FILE_NAME);
            var oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(fos);
        } catch (FileNotFoundException e) {
            throw new DataExportException("Brak pliku " + FILE_NAME);
        } catch (IOException e) {
            throw new DataExportException("Brak zapisu danych do pliku " + FILE_NAME);
        }
    }
}
