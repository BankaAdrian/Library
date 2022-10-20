package pl.adrianbanka.Library.Model;

public class Magazine extends Publication {
    private int month;
    private int day;
    private String language;

    public Magazine(int year, String title, String publisher, int month, int day, String language) {
        super(title, publisher);
        this.month = month;
        this.day = day;
        this.language = language;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getLanguage() {
        return language;
    }

    public void printInfo() {
        String info = "Rok: " + getYear() + "Tytuł " + getTitle() + "Publisher: " + getPublisher() +
                "Miesiąc " + getMonth() + "Dzień" + getDay() + "Język" + getLanguage();

        System.out.println(info);
    }
}
