import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //list variables - using double for decimal measurements
        double meterMeasure = 0;
        double mileMeasure = 0;
        double feetMeasure = 0;
        double inchMeasure = 0;
        String trash = ""; //takes into account an entry that is not valid
        boolean done = false; //set the done boolean to false

        do {
            //prompt user for input
            System.out.print("Enter a measurement in meters: ");
            if (in.hasNextDouble()) {
                meterMeasure = in.nextDouble(); //mark entry as width variable
                in.nextLine();

                done = true; //mark boolean as true to exit loop
            } else { //valid entry not met, repeat loop until valid entry - tell user the invalid entry
                trash = in.nextLine();
                System.out.println("You have to enter a valid measurement in meters, not: " + trash);
            }
        } while (!done);

        //begin calculations with variable entries
        mileMeasure = meterMeasure / 1609;
        feetMeasure = meterMeasure * 3.28084;
        inchMeasure = meterMeasure * 39.3701;
        //output each calculation in a new line for easier readability
        System.out.println(meterMeasure + " meters is " + mileMeasure + " miles.");
        System.out.println(meterMeasure + " meters is " + feetMeasure + " feet.");
        System.out.println(meterMeasure + " meters is " + inchMeasure + " inches.");
    }
}
