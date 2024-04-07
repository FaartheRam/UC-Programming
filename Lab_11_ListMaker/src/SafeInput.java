import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SafeInput {
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine(); // set input as variable
        } while(retString.length() == 0);
        return retString; // return input variable
    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return an int
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retInt = -1; // set variable
        boolean run = true; // set boolean to true
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt(); // set input to variable
                pipe.nextLine();
                run = false; // set boolean to false - end loop
            } else {
                pipe.nextLine();
            }
        } while (run); // while run is true - loop
        return retInt; // return input variable
    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a double
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = -1;
        boolean run = true;
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            if (pipe.hasNextDouble()) { // if input has double
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                run = false; // set boolean to false - end loop
            } else { // if input is invalid (anything else)
                pipe.nextLine();
            }
        } while (run); // boolean is true - keep looping
        return retDouble;
    }

    /**
     *
     * @param num an int to compare
     * @param low an int representing the lower bound
     * @param high an int representing the upper bound
     * @return true if number is between low and high
     */
    private static boolean isInRangeInt(int num, int low, int high) {
        return (num >= low && num <= high); // is int within limit
    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low an int representing the lower bound
     * @param high an int representing the upper bound
     * @return an int within the provided bounds
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt = -1;
        boolean run = true; // set boolean to true
        String trash = ""; // open string variable
        do {
            System.out.print("\n" + prompt + " [" + low + ", " + high + "]: "); // show prompt add space
            if (pipe.hasNextInt()) { // if input has an integer
                retInt = pipe.nextInt(); // set integer to retint
                pipe.nextLine();
                if (isInRangeInt(retInt, low, high)) {
                    run = false; // set boolean to false - end loop
                }
            } else {
                pipe.nextLine(); // anything not valid
            }
        } while (run); // set boolean to true - end loop
        return retInt; // return variable
    }

    /**
     *
     * @param num a double to compare
     * @param low a double representing the lower bound
     * @param high a double representing the upper bound
     * @return true if number is between low and high
     */
    private static boolean isInRangeDouble(double num, double low, double high) {
        return (num >= low && num <= high); // is the number within limit
    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low a double representing the lower bound
     * @param high a double representing the upper bound
     * @return a double within the provided bounds
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retDouble = -1; // retdouble variable
        boolean run = true; // set boolean to true

        do {
            System.out.print("\n" + prompt + " [" + low + ", " + high + "]: "); // show prompt add space
            if (pipe.hasNextDouble()) { // if input has double
                retDouble = pipe.nextDouble(); // set as variable
                pipe.nextLine();
                if (isInRangeDouble(retDouble, low, high)) { // if its in range
                    run = false; // set boolean to false - end loop
                }
            } else { // if anything else
                pipe.nextLine();
            }
        } while (run); // while run is true - loop
        return retDouble; // return input variable
    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return true if "Y" and false for "N"
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean retBool = false; // set boolean to false
        String ans = ""; // open string
        boolean run = true; // set boolean to true
        do {
            System.out.print("\n" + prompt + "? [Y/N] "); // show prompt add sapce
            if (pipe.hasNext()) {
                ans = pipe.nextLine().toUpperCase();
                if (ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("N")) { // if the answer is yes or no - not case sensitive
                    run = false; // set boolean to false - end loop
                }
            }
        } while (run); // while run is true - keep looping
        if (ans.equals("Y")) { // if answer returned was yes
            retBool = true; // set boolean to true
        }
        return retBool; // return default set boolean
    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param RegEx string representing the desired regex
     * @return a valid RegEx string
     */

    public static String getRegExString(Scanner pipe, String prompt, String RegEx) {
        String stringToSearch = "";
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            stringToSearch = pipe.nextLine();
            Pattern regexPattern = Pattern.compile(RegEx); // set pattern
            Matcher regexMatcher = regexPattern.matcher(stringToSearch); // set pattern
            if (regexMatcher.find()) {
                return regexMatcher.group(0);
            }
        } while(true);
    }

    public static void prettyHeader(String msg) {
        if (msg.length() < 52) { // message length that can still be centered
            // set variables
            int position = 0;
            int valSpacesAfter = 0;
            boolean isEvenLength = (msg.length() % 2 == 0);
            for (int i = 0; i < 3; i++) {
                if (i % 2 == 0) {
                    for(int j = 0; j < 60; j++) {
                        System.out.print("*"); // print this if
                    }
                    System.out.println();
                } else {
                    position = (54 - msg.length());
                    System.out.print("***"); // print this else
                    for (int k = 0; k < position / 2; k++) {
                        System.out.print(" "); // print spaces
                    }
                    System.out.print(msg); // print inputted message
                    if (isEvenLength) {
                        valSpacesAfter = position / 2;
                    } else {
                        valSpacesAfter = position / 2 + 1;
                    }
                    for (int l = 0; l < valSpacesAfter; l++) {
                        System.out.print(" "); // print spaces
                    }
                    System.out.println("***"); // print this else
                }
            }
        } else {
            System.out.println("Your message is too long, please try again with a shorter message."); // if message is too long and cant fit in the space
        }
    }
}