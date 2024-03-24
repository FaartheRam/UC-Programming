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
        int[] dataPoints = new int[100];

        //b
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        //c
        for (int j = 0; j < dataPoints.length; j++) {
            if (j < dataPoints.length - 1) {
                System.out.print(dataPoints[j] + " | "); // line between data points
            } else {
                System.out.print(dataPoints[j]);
            }
        }

        //d
        getAverage(dataPoints);

        /* -------------------------------------------------------------------------------------------------- */

        //Part 2: Linear Search
        Scanner in = new Scanner(System.in);
        int count = 0;

        //a
        int ans = SafeInput.getRangedInt(in, "Enter an integer value between 1 and 100", 1, 100);

        //b
        occurenceScan(dataPoints, ans);

        //c
        int val = SafeInput.getRangedInt(in, "Enter an integer value between 1 and 100", 1, 100);
        contains(dataPoints, val);

        //d
        min(dataPoints);
        max(dataPoints);

        //e
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[]) {
        double sum = 0;
        double average;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        average = sum/values.length;
        System.out.printf("\nThe sum of the datapoints is %.2f and the average is %.2f.\n", sum, average);
        return average;
    }

    public static int min(int values[]) {
        int min = values[0];
        for (int n = 0; n < values.length; n++) {
            if (values[n] < min) {
                min = values[n];
            }
        }
        System.out.printf("\nThe min value is %d.\n", min);
        return min;
    }

    public static int max(int values[]) {
        int max = values[0];
        for (int n = 0; n < values.length; n++) {
            if (values[n] > max) {
                max = values[n];
            }
        }
        System.out.printf("\nThe max value is %d.\n", max);
        return max;
    }

    public static int occurenceScan(int values[], int target) {
        int count = 0;
        for (int l = 0; l < values.length; l++) {
            if (target == values[l]) {
                count++;
            }
        }
        System.out.printf("\n%d appeared in the DataPoints array %d times.\n", target, count);
        return count;
    }

    public static int sum(int values[]) {
        int sumOfValues = 0;
        for (int i = 0; i < values.length; i++) {
            sumOfValues += values[i];
        }
        return sumOfValues;
    }

    public static boolean contains(int values[], int target) {
        int matches = -1;
        for (int m = 0; m < values.length; m++) {
            if (target == values[m]) {
                matches = m;
                break;
            }
        }
        if (matches != -1) {
            System.out.printf("\nThe value %d was found at array index %d.\n", target, matches);
            return true;
        } else {
            System.out.printf("\nThe value %d was not found.\n", target);
            return false;
        }
    }
}