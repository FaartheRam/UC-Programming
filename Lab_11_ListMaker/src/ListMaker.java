import java.util.Scanner;
import java.util.ArrayList;

public class ListMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> arrList = new ArrayList<>();
        String ans = ""; // string for input
        boolean run = true; // set boolean to true

        do {
            ans = printMenu(in, arrList);
            switch (ans) {
                case "A": // a for add
                    addToArrList(in, arrList); // add to list
                    break; // break loop
                case "D": // d for delete
                    deleteFromArrList(in, arrList); // delete from list
                    break; // break loop
                case "P": // p for display
                    displayArrList(arrList);
                    break; // break loop
                case "Q": // q for quit
                    if (SafeInput.getYNConfirm(in, "Are you sure")) { // ask to confirm "quit"
                        run = false; // set boolean to false - end loop
                    } else {
                        System.out.println("Returning to menu..."); // return to menu if not ready to quit
                    }
                    break; // break loop
            }
        } while (run); // while run is true
    }

    public static void addToArrList(Scanner in, ArrayList arrList) { // add
        String itemToAdd = SafeInput.getNonZeroLenString(in, "What would you like to add to the array list"); // ask for add item input
        arrList.add(itemToAdd); // add item to array
    }

    public static void deleteFromArrList(Scanner in, ArrayList arrList) { // delete
        int itemToDelete = SafeInput.getRangedInt(in, "What item do you want to delete", 1, arrList.size()); // ask for delete item input
        arrList.remove(itemToDelete - 1); // remove user input item
    }

    public static void displayArrList(ArrayList arrList) { // display
        for (int i = 0; i < arrList.size(); i++) { // scan the array
            System.out.println(arrList.get(i)); // display the current array list
        }
    }

    private static String printMenu(Scanner in, ArrayList arrList) { // print list
        if (arrList.isEmpty()) { // if list is empty
            System.out.println("Your list is currently empty."); // if list is empty, display that
        } else { // if list is not empty
            System.out.println("Current list:"); // output text to user
            for (int i = 0; i < arrList.size(); i++) { // scan the array
                System.out.printf("    %d. %s\n", i + 1 , arrList.get(i)); // display current list
            }
        }
        return SafeInput.getRegExString(in, "Select a menu option:\n    A: Add\n    D: Delete\n    P: Print\n    Q: Quit\n", "[AaDdPpQq]").toUpperCase(); // ask for input - change input to uppercase
    }
}