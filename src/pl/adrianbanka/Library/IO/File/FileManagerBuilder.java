package pl.adrianbanka.Library.IO.File;

import pl.adrianbanka.Library.Exceptions.DataExportException;
import pl.adrianbanka.Library.Exceptions.NoSuchFileTypeException;
import pl.adrianbanka.Library.IO.ConsolePrinter;
import pl.adrianbanka.Library.IO.DataReader;

import java.util.Locale;

public class FileManagerBuilder {
    private ConsolePrinter printer;
    private DataReader reader;

    public FileManagerBuilder(ConsolePrinter printer, DataReader reader) {
        this.printer = printer;
        this.reader = reader;
    }

    public FileManager build() {
        printer.printLine("Wybierz format danych: ");
        FileType fileType = getFileType();
        switch (fileType) {
            case SERIAL :
                return new SerializableFileManager();
            default:
                throw new NoSuchFileTypeException("Nieobsługiwany typ danych");
        }
    }

    private FileType getFileType() {
        boolean typeOk = false;
        FileType result = null;
        do {
            printTypes();
            String type = reader.getString().toUpperCase(Locale.ROOT);
            try {
                FileType.valueOf(type);
                typeOk = true;
            } catch (IllegalArgumentException e) {
                printer.printLine("Nieobsługiwany typ danych.");
            }
        } while (!typeOk);
        return result;
    }

    private void printTypes() {
        for(FileType value : FileType.values()) {
            printer.printLine(value.name());
        }
    }
}
