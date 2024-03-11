import java.util.Scanner;

public class GetUserName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = ""; // set open string
        String lastName = ""; // set open string
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name"); // use safeinput for prompt
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name"); // use safeinput for prompt
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1); // set first letter to capital
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1); // set first letter to capital
        System.out.println("\nYour full name is: " + firstName + " " + lastName); // output to user
    }
}