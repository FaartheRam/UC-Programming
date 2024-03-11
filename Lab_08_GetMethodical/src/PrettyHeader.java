import java.util.Scanner;

public class PrettyHeader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a message to print: "); // Enter a message to make a header
        String msg = in.nextLine(); // String msg = "Returns the substring starting from the specified index (beginIndex and extends to the character)
        SafeInput.prettyHeader(msg); // import safeinput
    }
}