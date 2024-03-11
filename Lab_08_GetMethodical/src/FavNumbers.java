import java.util.Scanner;
public class FavNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt = SafeInput.getInt(in, "Enter your favorite integer"); // prompt user to enter favorite int using safeinput
        double favDouble = SafeInput.getDouble(in, "Enter your favorite double"); // prompt user for double using safeinput
        System.out.printf("Your favorite integer is %d and your favorite double is %f.", favInt, favDouble); // output to user
    }
}