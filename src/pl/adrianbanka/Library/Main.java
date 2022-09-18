package pl.adrianbanka.Library;

public class Main {

    public static void main(String[] args) {
        Adress adress1 = new Adress();
        adress1.city = "Wrocław";
        adress1.postalCode = 34-122;
        adress1.street = "kosciuszki";
        adress1.flatNo = 78;

        Adress adress2 = new Adress();
        adress2.city = "Siewierz";
        adress2.postalCode = 12-444;
        adress2.street = "czestochowska";
        adress2.flatNo = 56;

        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.adress = adress1;

        Person person2 = new Person();
        person2.firstName = "Jan";
        person2.lastName = "Kowalski";
        person2.adress = adress2;

        Auction auction1 = new Auction();
        auction1.title = "passat b5";
        auction1.description = "najlepsze auto";
        auction1.price = 5000;
        auction1.seller = person1;

        Auction auction2 = new Auction();
        auction2.title = "audi b5";
        auction2.description = "chujnia";
        auction2.price = 2000;
        auction2.seller = person2;


    }
}
