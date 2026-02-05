package netology.homework;

import netology.homework.deals.Deal;
import netology.homework.taxes.TaxSystem;

public class Company {
    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void payTaxes() {
        int taxAmount = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + taxAmount + " руб.");
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals){
        for (int i = 0; i < deals.length; i++) {
            shiftMoney(deals[i].getDebitChange());
            shiftMoney((-1)*deals[i].getCreditChange());
        }
        int incomeMinusExpenses = Math.max(debit - credit, 0);
        payTaxes();
        return incomeMinusExpenses;
    }
}
