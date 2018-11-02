package register;

public class CashRegister {
    private double purchase;
    private String state;
    private TaxCalculator taxCal;

    public CashRegister(String state, TaxCalculator taxCal) {
        this.state = state;
        this.taxCal = taxCal;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public double getTotal() {
        return purchase + taxCal.calculate(purchase);
    }
}
