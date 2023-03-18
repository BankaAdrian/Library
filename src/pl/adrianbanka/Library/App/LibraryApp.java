package pl.adrianbanka.Library.App;

import java.io.IOException;

public class LibraryApp {
    public static final String APP_NAME = "Biblioteka v1.8";

    public static void main(String[] args) throws IOException {
        System.out.println(APP_NAME);

        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
    }
}
