package netology.homework.taxes;

public class STSIncomeMinusExpenses extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {
        int taxAmount = (debit-credit)*15/100;
        if(taxAmount>0){
            return taxAmount;
        }
        return 0;
    }
}
