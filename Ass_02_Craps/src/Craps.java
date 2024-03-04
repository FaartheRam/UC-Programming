import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        Random rnd = new Random(); // import random number generator
        Scanner in = new Scanner(System.in); // import scanner
        boolean run = true; // set boolean 'run' to true
        int point = 0; // set variables
        int numWins = 0;
        int numLosses = 0;
        String response = ""; // response is open
        System.out.println("Welcome to Craps!"); // Welcome message - program will run automatically
        while (run) { // while the boolean run is true, run the program
            System.out.println("Rolling the dice...");
            int die1 = rnd.nextInt(6) + 1; // sets die to a random number within 6 representing 6 face die
            int die2 = rnd.nextInt(6) + 1; // sets die to a random number within 6 representing 6 face die
            int sum = die1 + die2; // sum adds the die rolls together
            int incorrectInput = 0; // set variable incorrect input - trying different method for invalid input to see if I can get it to work
            System.out.println("Die 1: " + die1); // show die 1 roll
            System.out.println("Die 2: " + die2); // show die 2 roll
            System.out.println("  Sum: " + sum); // show die 1 and die 2 sum
            if (sum == 2 || sum == 3 || sum == 12) { // if you crap out and roll these number
                System.out.println("You 'Crapped' out! Better luck next time!"); // display crap message
                numLosses += 1; // add 1 to loss counter that will display at end
                incorrectInput = 0;
                do {
                    if (incorrectInput > 0) { // if user does not provide correct input ( we will add to make this true)
                        System.out.print("Invalid input. ");
                    }
                    System.out.print("Would you like to play again? (Y/N): "); // ask to play again
                    incorrectInput += 1; // increase incorrect input by 1 to make incorrect input > 0
                    response = in.nextLine();
                } while (!response.equalsIgnoreCase("N") && !response.equalsIgnoreCase("Y"));
                    // while the response is correct - also not case sensitive
            } else if (sum == 7 || sum == 11) { // winning sums
                System.out.println("You are a 'Natural!' You win!"); // display win message
                numWins += 1; // increase numWins by 1 that will display at end
                incorrectInput = 0; // incorrect input = 0 again
                do {
                    if (incorrectInput > 0) { // if it's greater than 1 - its incorrect
                        System.out.print("Invalid input. "); // display invalid input
                    }
                    System.out.print("Would you like to play again? (Y/N): "); // ask for replay
                    incorrectInput += 1; // if not correct input (Y/N) increase incorrectInput by 1
                    response = in.nextLine();
                } while (!response.equalsIgnoreCase("N") && !response.equalsIgnoreCase("Y"));
                    // if we have gotten correct input
            } else { // everything else
                point = sum; // sets sum to point
                System.out.println("Point is now " + point); // shows current point
                do { // roll again
                    die1 = rnd.nextInt(6) + 1; // same random roll of 6 sided dice
                    die2 = rnd.nextInt(6) + 1; // same random roll of 6 sided dice
                    sum = die1 + die2; // add rolls - log as sum
                    System.out.println("Roll: " + sum);
                    if (sum == 7) { // if losing roll
                        System.out.println("You 'Crapped' out!");
                        numLosses += 1; // add to loss counter that will display at end
                        incorrectInput = 0; // set incorrect input to 0
                        do {
                            if (incorrectInput > 0) { // if its greater than 0 - its not valid
                                System.out.print("Invalid input. "); // display that input is invalid
                            }
                            System.out.print("Would you like to play again? (Y/N) "); // asl for replay
                            incorrectInput += 1; // if incorrect input - add 1 to incorrectInput
                            response = in.nextLine();
                        } while (!response.equalsIgnoreCase("N") && !response.equalsIgnoreCase("Y"));
                        // ignore case again - while response is correct
                    } else if (sum == point) {  // winning roll
                        System.out.println("You win!"); // winning roll
                        numWins += 1; // add to win counter that will display at end
                        incorrectInput = 0; // set value to 0
                        do {
                            if (incorrectInput > 0) { // you get the point now
                                System.out.print("Invalid input. "); // show invalid input
                            }
                            System.out.print("Would you like to play again? (Y/N): "); // ask for replay
                            incorrectInput += 1; // add 1 to variable
                            response = in.nextLine();
                        } while (!response.equalsIgnoreCase("N") && !response.equalsIgnoreCase("Y"));
                        // if input is valid
                    } else {
                        System.out.println("Trying for point. Rolling again..."); // not a win or loss - roll once more
                        die1 = rnd.nextInt(6) + 1; // 6 faced dice random
                        die2 = rnd.nextInt(6) + 1; // 6 faced dice random
                        sum = die1 + die2; // add it again
                    }
                } while (sum != 7 && sum != point);
            }
            if (response.equalsIgnoreCase("N")) { // user decided to stop - display win/loss totals and amount of games
                System.out.println(String.format("Thank you for playing! You played %d game(s): %dW & %dL!", numWins + numLosses, numWins, numLosses));
                System.exit(0); // exit
            }
        }
    }
}