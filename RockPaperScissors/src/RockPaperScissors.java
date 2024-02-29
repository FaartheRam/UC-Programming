import java.util.Scanner;

public class RockPaperScissors {

    public static String fullChoice(String choice) {
        if (choice.equalsIgnoreCase("R")) {
            return "Rock";
        } else if (choice.equalsIgnoreCase("P")) {
            return "Paper";
        } else if (choice.equalsIgnoreCase("S")) {
            return "Scissors";
        } else {
            return "Invalid";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Player A, Rock, Paper or Scissors? (R/P/S) ");
        String pAChoice = in.nextLine();
        while (!(pAChoice.equalsIgnoreCase("R") || pAChoice.equalsIgnoreCase("P") || pAChoice.equalsIgnoreCase("S"))) {
            System.out.print("Invalid selection! Please input R, P or S: ");
            pAChoice = in.nextLine();
        }

        System.out.print("Player B, Rock, Paper or Scissors? (R/P/S) ");
        String pBChoice = in.nextLine();
        while (!(pBChoice.equalsIgnoreCase("R") || pBChoice.equalsIgnoreCase("P") || pBChoice.equalsIgnoreCase("S"))) {
            System.out.print("Invalid selection! Please input R, P or S: ");
            pBChoice = in.nextLine();
        }

        if (pAChoice.equalsIgnoreCase("R") && pBChoice.equalsIgnoreCase("P")) {
            System.out.println("Paper covers rock, Player B wins!");
        } else if (pAChoice.equalsIgnoreCase("R") && pBChoice.equalsIgnoreCase("S")) {
            System.out.println("Rock breaks scissors, Player A wins!");
        } else if (pAChoice.equalsIgnoreCase("P") && pBChoice.equalsIgnoreCase("R")) {
            System.out.println("Paper covers rock, Player A wins!");
        } else if (pAChoice.equalsIgnoreCase("P") && pBChoice.equalsIgnoreCase("S")) {
            System.out.println("Scissors cut paper, Player B wins!");
        } else if (pAChoice.equalsIgnoreCase("S") && pBChoice.equalsIgnoreCase("R")) {
            System.out.println("Rock breaks scissors, Player B wins!");
        } else if (pAChoice.equalsIgnoreCase("S") && pBChoice.equalsIgnoreCase("P")) {
            System.out.println("Scissors cut paper, Player A wins!");
        } else {
            String fullChoiceA = fullChoice(pAChoice);
            String fullChoiceB = fullChoice(pBChoice);
            System.out.printf("%s vs %s, Tie game!\n", fullChoiceA, fullChoiceB);
        }
        System.out.println("To play again, re-run the program. Goodbye!");
        System.exit(0);
    }
}