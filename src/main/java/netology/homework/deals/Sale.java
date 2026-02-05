package netology.homework.deals;

public class Sale extends Deal {

    public Sale(String title, int cost) {
        this.comment = "Продажа " + title + " на " + cost + " руб.";
        this.debitChange = cost;
        this.creditChange = 0;
    }
}
