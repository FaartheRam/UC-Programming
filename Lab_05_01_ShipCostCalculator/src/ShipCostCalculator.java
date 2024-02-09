import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shipCost = 0;
        final double SHIPPING_COST = 0.02;
        double totalCost = 0;
        String trash = ""; //takes into account an entry that is not valid
        // Get the item price and make sure it is valid
        // Use Print instead of Println
        System.out.print("Enter the price of an item: ");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble(); //if the entry is valid, move on to the next part
            in.nextLine(); //clears
        }
        else {
            trash = in.nextLine(); //if the entry is not valid, output reason and start over
            System.out.println("Enter a valid number and not " + trash);
            System.out.println("Run the program again with an actual item price.");
            System.exit(0);
        }
        if (itemPrice <= 100) { //calculate for greater than 100
            shipCost = itemPrice * SHIPPING_COST;
            totalCost = shipCost + itemPrice;
            System.out.println("The shipping cost for your order is " + shipCost);
            System.out.println("The total for your order is " + totalCost);
        }
        else if (itemPrice >= 100) {//calculate for shipping since it doesn't qualify
            totalCost = itemPrice;
            System.out.println("Your Shipping is Free!");
            System.out.println("The total for your order is " + totalCost);
        }

    }
}