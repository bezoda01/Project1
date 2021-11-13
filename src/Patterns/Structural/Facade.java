package Patterns.Structural;

class ProviderCommunication {
    public void receive() {
        System.out.println("Получение продукции от производителя");
    }

    public void payment() {
        System.out.println("Оплата поставщику с удержанием за продажу продукции");
    }
}

class Site {
    public void placement() {
        System.out.println("Размещение на сайте");
    }

    public void del() {
        System.out.println("Удаление с сайта");
    }
}

class Database {
    public void insert() {
        System.out.println("Запись в базу данных");
    }

    public void del() {
        System.out.println("Удаление из базы данных");
    }
}

class MarketPlace {
    private ProviderCommunication providerCommunication;
    private Site site;
    private Database database;

    public MarketPlace() {
        providerCommunication = new ProviderCommunication();
        site = new Site();
        database = new Database();
    }
    public void productReceipt(){
        providerCommunication.receive();
        site.placement();
        database.insert();
    }
    public void productRelease(){
        providerCommunication.payment();
        site.del();
        database.del();
    }
}

public class Facade {
    public static void main(String[] args) {

        MarketPlace marketPlace = new MarketPlace();
        marketPlace.productReceipt();
        System.out.println("--------------------------");

        marketPlace.productRelease();
    }
}
