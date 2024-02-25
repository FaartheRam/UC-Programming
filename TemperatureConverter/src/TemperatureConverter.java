import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //list variables
        double tempCels = 0; //celcius
        double tempFahr = 0; //fahrenheit
        int result = 0; //first input from user
        String trash = ""; //takes into account an entry that is not valid
        boolean done = false;//sets boolean to false

        do {
            System.out.print("Fahrenheit to Celsius (1) or Celsius to Fahrenheit (2): "); //ask user to select which conversion
            if (in.hasNextInt()) { //if it has an integer
                result = in.nextInt();
                if (result >= 1 && result <= 2) { //if the input is within the requested parameters
                    done = true;
                } else {
                    trash = in.nextLine();
                    System.out.println("You must enter a [1] or a [2], not: " + result); //if the input is not 1 or 2
                }
            } else {
                trash = in.next();
                System.out.println("You must enter a [1] or a [2], not: " + trash); //if the input is anything other than an integer
            }

            if (result == 1) { //selection
                //fahrenheit to celsius
                done = false; //rest boolean
                do {

                    System.out.println("Enter Fahrenheit value: ");
                    if (in.hasNextDouble()) {
                        tempFahr = in.nextDouble(); //logs input as variable
                        in.nextLine();

                        done = true; //counter to true - move to next step
                    } else { //incorrect input - not a double - log it and tell user in next line
                        trash = in.nextLine();
                        System.out.println("You have to enter a valid temperature in Fahrenheit, not " + trash);
                    }
                } while (!done); //loop finished - continue to next step

                tempCels = (tempFahr - 32) * 5 / 9; //convert F to C
                System.out.print(tempFahr + " degrees Fahrenheit converts to " + tempCels + " degrees Celsius.");

            }
            if (result == 2) { //selection
                done = false; //rest the boolean
                do {
                    System.out.print("Enter Celsius value: ");
                    if (in.hasNextDouble()) {
                        tempCels = in.nextDouble();//logs input as variable
                        in.nextLine();

                        done = true;//correct input move on to next - mark boolean as true
                    } else {//it must not be correct - log trash - tell user - repeat
                        trash = in.nextLine();//log trash
                        System.out.println("You have to enter a valid temperature in Celsius, not: " + trash);//inform user
                    }
                } while (!done);//complete loop

                tempFahr = (tempCels * 1.8) + 32;
                System.out.print(tempCels + " degrees Celsius converts to " + tempFahr + " degrees Fahrenheit.");

            }
        } while (!done); //we did it!
    }
}










