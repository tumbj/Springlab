package registerSI;

public class CashRegister {
    private double purchase;
    private String state;
    private TaxCalculator taxCal;

    public CashRegister() {
        this.state = "";
        this.taxCal = null;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setTaxCal(TaxCalculator taxCal){
        this.taxCal = taxCal;
    }
    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public double getTotal() {
        return purchase + taxCal.calculate(purchase);
    }
}
