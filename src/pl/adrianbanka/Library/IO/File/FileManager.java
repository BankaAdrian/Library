package pl.adrianbanka.Library.IO.File;

import pl.adrianbanka.Library.Model.Library;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileManager {
    Library importData() throws IOException;
    void exportData(Library library);

}
