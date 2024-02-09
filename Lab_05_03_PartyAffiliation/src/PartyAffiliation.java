import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        String menu = "D - Democrat\tR - Republican\t  I - Independent: ";//\t for tab spacing
        System.out.println("What is your party affiliation? ");
        System.out.print(menu);
        menuChoice = in.nextLine();

        if (menuChoice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey!");
        } else if (menuChoice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant");
        } else if (menuChoice.equalsIgnoreCase("I")) {
            System.out.println("You are an Independent Person!");
        } else //takes all other inputs and places them in "Other"
            System.out.println("You have selected 'Other'.");
        }
}