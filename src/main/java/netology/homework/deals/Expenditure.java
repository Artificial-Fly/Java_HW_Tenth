package netology.homework.deals;

public class Expenditure extends Deal{

    public Expenditure(String title, int cost) {
        this.comment = "Покупка "+title+" на "+cost+" руб.";
        this.creditChange = cost;
        this.debitChange = 0;
    }
}
