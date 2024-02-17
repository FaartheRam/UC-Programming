import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //create variables
        double gallonsTank = 0;//gallons in the tank
        double gallonsMiles = 0;//miles per gallon
        double gallonsPrice = 0;//cost per gallon
        double fuelAmount = 0;
        double tripCost = 0;//cost of the trip to go 100 miles
        double fuelDistance = 0;//how far the current tank will go
        String trash = ""; //takes into account an entry that is not valid
        boolean done = false; //set the boolean to false

        do {
            //prompt user for input
            System.out.print("Enter the amount of gallons in the gas tank: ");
            if (in.hasNextDouble()) {
                gallonsTank = in.nextDouble();//log input as variable
                in.nextLine();

                done = true;
            } else { //loop back till input is valid
                trash = in.nextLine();
                System.out.println("You have to enter a valid number of gallons in the gas tank, not: " + trash); //list invalid input to user
            }
        } while (!done);
        do {
            System.out.print("Enter the amount of miles you get per gallon: ");
            done = false;//reset the boolean counter to false for new loop
            if (in.hasNextDouble()) {//if the input is valid, log it and move on to the next
                gallonsMiles = in.nextDouble();//log input as variable
                in.nextLine();

                done = true;//mark the boolean as true and move on to next
            } else {
                trash = in.nextLine();
                System.out.println("You have to enter a valid number of miles you get per gallon, not: " + trash);
            }
        } while (!done);
        do {
            System.out.print("Enter the price per gallon in dollars and cents: ");
            done = false;//reset the boolean counter to false for new loop
            if (in.hasNextDouble()) {
                gallonsPrice = in.nextDouble();//log input as variable
                in.nextLine();

                done = true;//correct input - move on
            } else {//not correct - log the incorrect input and tell the user and loop back
                trash = in.nextLine();
                System.out.println("You have to enter a valid number of miles you get per gallon, not: " + trash);
            }
        } while (!done);

        //Print cost per 100 miles and how far the car can go with the gas in the tank
        fuelAmount = 100 / gallonsMiles;//how many gallons to go 100 miles
        tripCost = fuelAmount * gallonsPrice;//how much that amount of gallons would cost
        fuelDistance = gallonsTank * gallonsMiles;//how far the current tank can go

        System.out.println("The cost to drive 100 miles in your car is $" + tripCost + " and you can drive " + fuelDistance + " miles before running out of gas.");
    }
}
