package strategypattern;

import java.util.function.Function;

public class StrategyPatternMain {
    public static void main(String[] args) {
        final Invoice invoice = new Invoice(i -> Helper.myFunc());
        invoice.calculateTax();

        Function<Invoice, Double> myf = (Invoice inv) -> 20d;
        process(new Invoice(myf));
    }

    private static void process(Invoice invoice) {
        invoice.calculateTax();
        invoice.setTaxCalculator(inv -> 10d);
        invoice.calculateTax();
    }

    public static class Helper {
        private Helper() {
        }

        public static double myFunc() {
            return 50d;
        }
    }
}
