import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //list variables
        double tempCels = 0;
        double tempFahr = 0;
        String trash = ""; //takes into account an entry that is not valid
        boolean done = false;//sets boolean to false

        do {
            System.out.print("Enter the temperature in Celcius: ");
            if (in.hasNextDouble()) {
                tempCels = in.nextDouble();//logs input as variable
                in.nextLine();

                done = true;//correct input move on to next - mark boolean as true
            } else {//it must not be correct - log trash - tell user - repeat
                trash = in.nextLine();//log trash
                System.out.println("You have to enter a valid temperature in Celsius, not: " + trash);//inform user
            }
        } while (!done);//complete loop

        tempFahr = (tempCels * 1.8) + 32;//calculation for input

        System.out.println(+ tempCels + " degrees Celsius converts to " + tempFahr + " degrees Fahrenheit.");
    }
}




