package netology.homework.deals;

public class Expenditure extends Deal {

    public Expenditure(String title, int cost) {
        super("Покупка " + title + " на " + cost + " руб.", cost, 0);
    }
}
