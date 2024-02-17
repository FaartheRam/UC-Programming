import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
//Create a scanner object
        Scanner in = new Scanner(System.in);
//Create variables
        int answer = 0;
        int guess = 0;
        final int MAX = 10; //sets the int to a max of 10
        Random rand = new Random(); //random instance
        String trash = ""; //sets the variable for trash
        boolean correct = false; //two booleans set to false, first one is for correct guesses
        boolean done = false; //second boolean is for incorrect/invalid inputs
        answer = rand.nextInt(MAX) + 1; //correct answer
        while (!correct) { // loop until correct guess
            do {
                System.out.println("Guess a number between 1 and 10: "); //ask for correct input
                if (in.hasNextInt()) {
                    guess = in.nextInt();
                    in.nextLine();

                    done = true; //if the input is valid, proceed with the program
                } else { //invalid input, loop back and try again
                    trash = in.nextLine();
                    System.out.println("You have to enter a valid number between 1 and 10, not: " + trash); //inform user of invalid input
                }
            } while (!done);
                if (guess > answer) { //if the guess is greater than
                    System.out.println("Too high, try again!");
                } else if (guess < answer) { //if the guess is lesser than
                    System.out.println("Too low, try again!");
                } else { //if it isn't lesser or greater it must be right
                    System.out.println("You guessed the right number!");
                    correct = true; //changes boolean to true, ends loop/program
                }
            }
        }
    }










