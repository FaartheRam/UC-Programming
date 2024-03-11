import java.util.Scanner;

public class Reggie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ans = "";
        boolean run = true;
        String socialSecurityNum = SafeInput.getRegExString(in, "Enter your social security number", "^[0-9]{3}-[0-9]{2}-[0-9]{4}$"); // pattern for social security number with dashes
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number", "(M|m)\\d{8}"); // 8 digit number with an M in front of it
        do {
            System.out.println("Select a menu option:\n    O: Open\n    S: Save\n    V: View\n    Q: Quit"); // menu selection
            if (in.hasNext()) {
                ans = in.nextLine().toUpperCase(); // move to uppercase
                if (ans.equalsIgnoreCase("O") || ans.equalsIgnoreCase("S") || ans.equalsIgnoreCase("V") || ans.equalsIgnoreCase("Q")) { //ignore case just in case
                    run = false; // if they answered with valid inputs - end loop
                }
            }
        } while (run); // while run is true - keep looping
    }
}