import java.util.Scanner;
public class CheckOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        At the 10$ store nothing is more than $10.00.  
        Prompt the user for the price of their item (.50 cents to $9.99 dollars) 
        using the getRangedDouble method and continue to input items as long as 
        they indicate that they have more using your getYNConfirm method.  
        Display the total cost of the item(s) to 2 decimal places with printf.  
        */
        Scanner in = new Scanner(System.in);
        double totalPrice = 0; // set price to a double
        boolean more; // set more as a boolean
        do {
            totalPrice += SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 9.99); // price between 50 cents and 9.99
            more = SafeInput.getYNConfirm(in, "Do you have more items"); // ask y/n (not case sensitive) for more items
        } while (more); // loop
        System.out.printf("The total cost: %.02f\n", totalPrice); // output to user with only two digits after decimal
    }
}