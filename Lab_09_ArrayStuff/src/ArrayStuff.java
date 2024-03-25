import java.util.Random;
import java.util.Scanner;
public class ArrayStuff {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Random rnd = new Random();
        //Part 1: DataPoints Array

        //a
        int[] dataPoints = new int[100]; // set datapoints (100)

        //b
        for (int i = 0; i < dataPoints.length; i++) { // start at the beginning, as long as it is less than the array, keep looping - increment by 1
            dataPoints[i] = rnd.nextInt(100) + 1; // random number between 1 and 100
        }

        //c
        for (int j = 0; j < dataPoints.length; j++) { // start at 0 - ""
            if (j < dataPoints.length - 1) { // counting down from 100
                System.out.print(dataPoints[j] + " | "); // display datapoint and line between data points
            } else {
                System.out.print(dataPoints[j]); // end loop
            }
        }

        //d
        getAverage(dataPoints);

        /* -------------------------------------------------------------------------------------------------- */

        //Part 2: Linear Search
        Scanner in = new Scanner(System.in);
        int count = 0; // set count variable

        //a
        int ans = SafeInput.getRangedInt(in, "Enter an integer value between 1 and 100", 1, 100);
        // get integer 1-100, log as variable
        //b
        occurenceScan(dataPoints, ans);
        // how many times user input occurs within array
        //c
        int val = SafeInput.getRangedInt(in, "Enter an integer value between 1 and 100", 1, 100);
        contains(dataPoints, val);
        // second variable
        //d
        min(dataPoints);
        max(dataPoints);
        // scan dataPoints for minimum and maximum values
        //e
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
        // display average of datapoints
    }

    public static double getAverage(int values[]) {
        double sum = 0; // sum variable
        double average; // average variable
        for (int i = 0; i < values.length; i++) { // start at the begging of the for loop, as long as it is less than array-length - keep looping. after each loop, increment i by 1
            sum += values[i]; // sum = sum + value
        }
        average = sum/values.length;
        System.out.printf("\nThe sum of the datapoints is %.2f and the average is %.2f.\n", sum, average);
        return average;
    }

    public static int min(int values[]) {
        int min = values[0]; // set variable
        for (int n = 0; n < values.length; n++) { // start at the begging of the for loop, as long as it is less than array-length - keep looping. after each loop, increment n by 1
            if (values[n] < min) { // if value is less than min
                min = values[n]; // variable = value
            }
        }
        System.out.printf("\nThe min value is %d.\n", min);
        return min; // return variable
    }

    public static int max(int values[]) {
        int max = values[0]; //variable for max value
        for (int n = 0; n < values.length; n++) { // start at the begging of the for loop, as long as it is less than array-length - keep looping. after each loop, increment n by 1
            if (values[n] > max) {
                max = values[n]; // set max as the highest value in the array
            }
        }
        System.out.printf("\nThe max value is %d.\n", max); // display max value in the array
        return max; // return variable
    }

    public static int occurenceScan(int values[], int target) {
        int count = 0;
        for (int l = 0; l < values.length; l++) { // start at the begging of the for loop, as long as it is less than array-length - keep looping. after each loop, increment l by 1
            if (target == values[l]) { // if input matches value
                count++; // increment count by 1
            }
        }
        System.out.printf("\n%d appeared in the DataPoints array %d times.\n", target, count); // how many times input value appears
        return count; // return variable
    }

    public static int sum(int values[]) {
        int sumOfValues = 0; // sum variable
        for (int i = 0; i < values.length; i++) { // start at the begging of the for loop, as long as it is less than array-length - keep looping. after each loop, increment i by 1
            sumOfValues += values[i]; // sum = sums + values
        }
        return sumOfValues; // return variable
    }

    public static boolean contains(int values[], int target) {
        int matches = -1; // set counter to -1
        for (int m = 0; m < values.length; m++) { // start at the begging of the for loop, as long as it is less than array-length - keep looping. after each loop, increment i by 1
            if (target == values[m]) { // if target matches a value
                matches = m; // input equals value
                break; // terminate the loop
            }
        }
        if (matches != -1) { // if matches does not equal -1 = number found
            System.out.printf("\nThe value %d was found at array index %d.\n", target, matches); // display matched variable and match = 1st place in array
            return true; // return boolean true
        } else { // this means matches if false
            System.out.printf("\nThe value %d was not found.\n", target); // display input not found
            return false; // return boolean false
        }
    }
}