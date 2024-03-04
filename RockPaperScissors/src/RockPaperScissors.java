import java.util.Scanner;

public class RockPaperScissors {
    //need comments
    public static String fullChoice(String choice) { // Setting strings to ignore case and cover all usable characters and any invalid inputs
        if (choice.equalsIgnoreCase("R")) { // another string for R
            return "Rock"; // set R to Rock (not case sensitive)
        } else if (choice.equalsIgnoreCase("P")) { // another string for P
            return "Paper"; // set P to Paper (not case sensitive)
        } else if (choice.equalsIgnoreCase("S")) { // another string for S
            return "Scissors"; // set S to Scissors (not case sensitive)
        } else { // if user enters anything other than what is asked
            return "Invalid"; // sets any string to invalid so we can cover user error
        }
    }

    public static void main(String[] args) { // we set the inputs, now we run the program
        Scanner in = new Scanner(System.in); // import scanner
        int incorrectInput = 0; // set incorrect input to 0
        String response = ""; // open string response
        boolean play = true; // set the replay counter to true
        while (play) { // while play is true - run the program
            System.out.print("Player A, Rock, Paper or Scissors? (R/P/S) "); // get the first user input
            String pAChoice = in.nextLine(); // users input goes in next line
            while (!(pAChoice.equalsIgnoreCase("R") || pAChoice.equalsIgnoreCase("P") || pAChoice.equalsIgnoreCase("S"))) {
                System.out.print("Invalid selection! Please input R, P or S: ");
                pAChoice = in.nextLine();
            } // covering invalid user input - if not correct ask for correct input again

            System.out.print("Player B, Rock, Paper or Scissors? (R/P/S) "); // get the second user input
            String pBChoice = in.nextLine();
            while (!(pBChoice.equalsIgnoreCase("R") || pBChoice.equalsIgnoreCase("P") || pBChoice.equalsIgnoreCase("S"))) {
                System.out.print("Invalid selection! Please input R, P or S: ");
                pBChoice = in.nextLine();
            } // covering second user invalid input - if not correct ask for correct input again

            if (pAChoice.equalsIgnoreCase("R") && pBChoice.equalsIgnoreCase("P")) {
                System.out.println("Paper covers Rock, Player B wins!");
                // if user a selects R and user P selects Paper - display this message
            } else if (pAChoice.equalsIgnoreCase("R") && pBChoice.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors, Player A wins!");
                // if user a selects rock and user b selects scissors - display this message
            } else if (pAChoice.equalsIgnoreCase("P") && pBChoice.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock, Player A wins!");
                // if user a selects paper and user b selects rock - display this message
            } else if (pAChoice.equalsIgnoreCase("P") && pBChoice.equalsIgnoreCase("S")) {
                System.out.println("Scissors cut Paper, Player B wins!");
                // if user a selects paper and user b selects scissors - display this message
            } else if (pAChoice.equalsIgnoreCase("S") && pBChoice.equalsIgnoreCase("R")) {
                System.out.println("Rock breaks Scissors, Player B wins!");
                // if user a selects scissors and user b selects rock - display this message
            } else if (pAChoice.equalsIgnoreCase("S") && pBChoice.equalsIgnoreCase("P")) {
                System.out.println("Scissors cut Paper, Player A wins!");
                // if user a selects scissors and user b selects paper - display this message
            } else { // if it is anything else - it is a tie
                String fullChoiceA = fullChoice(pAChoice); // sets string as full choice so it doesn't just display as a letter
                String fullChoiceB = fullChoice(pBChoice); // sets string as full choice so it doesn't just display as a letter
                System.out.printf("%s vs %s, Tie game!\n", fullChoiceA, fullChoiceB);
                // display whichever tie it is - as the full word, '%s' selects any type string, list those strings it selects from /n displays on new line
            }
            System.out.println("Would you like to play again? (y/n)"); // as for replay
            play = in.nextLine().trim().equalsIgnoreCase("y"); // "y" will set play to 'true', anything else will set it to false and end program.
        }
    }
}
