import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";
        System.out.print("Enter your birth month as a number [1-12]: ");

        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("Please enter a valid month and not " + trash);
            System.out.println("Run the program again with an actual month [1-12].");
            System.exit(0);
        }

        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
            System.out.println("Run the program again with a month as a number [1-12]");

        }
    }
}