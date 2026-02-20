package netology.homework.deals;

public class Sale extends Deal {

    public Sale(String title, int cost) {
        super("Продажа " + title + " на " + cost + " руб.", 0, cost);
    }
}
