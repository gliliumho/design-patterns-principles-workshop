package strategypattern;

import java.util.function.Function;

public class Invoice {
    private Function<Invoice, Double> taxCalculator;

    public Invoice(Function<Invoice, Double> taxCalculator) {
        setTaxCalculator(taxCalculator);
    }

    public void setTaxCalculator(Function<Invoice, Double> taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public double calculateTax(){
        final Double tax = taxCalculator.apply(this);
        System.out.println(tax);
        return tax;
    }
}
