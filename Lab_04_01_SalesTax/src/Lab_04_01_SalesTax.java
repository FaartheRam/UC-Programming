
public class Lab_04_01_SalesTax {
    public static void main(String[] args) {
        final double SALES_TAX = .05;
        double purchPrice = 3500;
        double purchTax = SALES_TAX * purchPrice;
        System.out.println("The tax for your purchase of " + purchPrice + " is " + purchTax);

    }
}