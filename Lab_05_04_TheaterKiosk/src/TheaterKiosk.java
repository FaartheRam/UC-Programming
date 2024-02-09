import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yourAge = 0;
        String trash = "";
        System.out.print("Please enter your age: ");

        if (in.hasNextInt()) {
            yourAge = in.nextInt();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("Please enter a valid age and not " + trash); //covering non-numbers, decimals
            System.out.println("Run the program again with an actual age."); //want to direct the user to input an age
            System.exit(0);
        }
        if (yourAge >= 21) {
            System.out.println("You get a wristband!");//user is the drinking age, they get a band
        }
        else {
            System.exit(0);//user does not get a wristband so end program and do nothing

        }
    }
}