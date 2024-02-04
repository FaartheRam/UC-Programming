
public class SalesTax {
    public static void main(String[] args) {
        final double SALES_TAX = .05;
        double purchPrice = 3500;
        double purchTax = 0;
        purchTax = SALES_TAX * purchPrice;
        System.out.println("The tax for your purchase of " + purchPrice + " is " + purchTax);

    }
}