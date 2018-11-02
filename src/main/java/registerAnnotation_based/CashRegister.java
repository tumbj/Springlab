package registerAnnotation_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CashRegister {
    private double purchase;
    private String state;
    private TaxCalculator taxCal;

    @Autowired
    public CashRegister( TaxCalculator taxCal) {
        this.taxCal = taxCal;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public double getTotal() {
        return purchase + taxCal.calculate(purchase);
    }
}
