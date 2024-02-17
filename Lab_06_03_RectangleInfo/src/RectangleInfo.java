import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //list variables - using double for decimal measurements
        double recWidth = 0;
        double recHeight = 0;
        double recPerimeter = 0;
        double recArea = 0;
        double recDiagonal = 0;
        String trash = ""; //takes into account an entry that is not valid
        boolean done = false; //set the done boolean to false

        do {
            //prompt user for input
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                recWidth = in.nextDouble(); //mark entry as width variable
                in.nextLine();

                done = true; //mark boolean as true to exit loop
            } else { //valid entry not met, repeat loop until valid entry - tell user the invalid entry
                trash = in.nextLine();
                System.out.println("You have to enter a valid rectangle width measurement, not: " + trash);
            }
        } while (!done);
        do {
            System.out.print("Enter the height of the rectangle: ");
            done = false; //reset the done counter to false to enter new loop
            if (in.hasNextDouble()) {
                recHeight = in.nextDouble(); //mark entry as height variable
                in.nextLine();

                done = true; //mark boolean as true to exit loop
            } else { //valid entry not met, repeat loop until valid entry - tell user the invalid entry
                trash = in.nextLine();
                System.out.println("You have to enter a valid rectangle height measurement, not: " + trash);
            }
        } while (!done);

        //being calculations with variable entries
        recPerimeter = (recHeight + recWidth) * 2; // calculating for perimeter
        recDiagonal = Math.sqrt(recHeight * recHeight + recWidth * recWidth); //pythagorean theorem for Diagonal
        recArea = recHeight * recWidth; //calculating for area
        //output each calculation in a new line for easier readability
        System.out.println("You entered the height as: " + recHeight + " and the width as: " + recWidth);
        System.out.println("The Diagonal of this rectangle is: " + recDiagonal);
        System.out.println("The Area of this rectangle is: " + recArea);
        System.out.println("The Perimeter of this rectangle is: " + recPerimeter);
    }
}
