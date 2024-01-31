
public class Main {
    public static void main(String[] args) {
        final double salesTax = (double) .05;
        double purchPrice = 3500;
        double purchTax = salesTax * purchPrice;
        System.out.printf("The tax for your purchase of " + purchPrice + " is " + purchTax);

    }
}