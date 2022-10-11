package pl.adrianbanka.Library.App;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka v.09";
        System.out.println(appName);

        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
    }
}
