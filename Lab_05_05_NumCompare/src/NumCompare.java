import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double userInputOne = 0;
        double userInputTwo = 0; //set double to allow decimals to be compared also
        String trash = ""; //takes into account an entry that is not valid
        // Get the double (allowing decimals)
        // Use Print instead of Println to get entry on same line
        System.out.print("Please enter the first number to be compared: ");
        if (in.hasNextDouble()) {
            userInputOne = in.nextDouble(); //if the entry is valid, move on to the next part
            in.nextLine(); //clears
        }
        else {
            trash = in.nextLine(); //if the entry is not valid, output reason and start over
            System.out.println("Enter a valid number and not " + trash); //tell the user their invalid input
            System.out.println("Run the program again with a number.");
            System.exit(0);
        }
        System.out.print("Please enter the second number to be compared: ");
        if (in.hasNextDouble()) {
            userInputTwo = in.nextDouble(); //if the entry is valid, move on to the next part
            in.nextLine(); //clears
        }
        else {
            trash = in.nextLine(); //if the entry is not valid, output reason and start over
            System.out.println("Enter a valid number and not " + trash); //tell the user their invalid input
            System.out.println("Run the program again with a number.");
            System.exit(0);
        }
        if (userInputOne == userInputTwo) { //
            System.out.println(userInputOne + " is equal to " + userInputTwo);
        }
        else if (userInputOne > userInputTwo) { //
            System.out.println(userInputOne + " is greater than " + userInputTwo);
        }
        else if (userInputOne < userInputTwo) { //
             System.out.println(userInputOne + " is less than " + userInputTwo);
        }

    }
}
