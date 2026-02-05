package netology.homework;

import netology.homework.deals.Deal;
import netology.homework.deals.Expenditure;
import netology.homework.deals.Sale;
import netology.homework.taxes.STSIncome;
import netology.homework.taxes.STSIncomeMinusExpenses;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //
        Company company = new Company();
        company.setTaxSystem(new STSIncome());
        company.shiftMoney(1000);
        company.shiftMoney(-100);
        company.payTaxes();
        company.setTaxSystem(new STSIncomeMinusExpenses());
        company.shiftMoney(1000);
        company.shiftMoney(-100);
        company.payTaxes();
        Deal[] deals = {
                new Expenditure("books", 100),
                new Sale("flowers", 1500),
                new Sale("flowers", 150),
                new Expenditure("cartoons", 70)
        };
        company.applyDeals(deals);
    }
}