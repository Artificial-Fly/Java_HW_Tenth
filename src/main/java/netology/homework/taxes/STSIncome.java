package netology.homework.taxes;

public class STSIncome extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int taxAmount = (debit) * 6 / 100;
        if (taxAmount > 0) {
            return taxAmount;
        }
        return 0;
    }
}
