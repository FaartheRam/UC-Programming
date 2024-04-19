import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;

public class FileAway {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inFile; // scan in file
        JFileChooser chooser = new JFileChooser(); // file chooser
        String line;
        int numLines = 0; // variable for lines
        int numWords = 0; // variable for words
        int numChars = 0; // variable for chars

        Path target = new File(System.getProperty("user.dir")).toPath();
        target = target.resolve("src");
        chooser.setCurrentDirectory(target.toFile());


        try {
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { // approve option
                target = chooser.getSelectedFile().toPath();
                inFile = new Scanner(target); // scan in file
                System.out.println("File: " + target.getFileName()); // print chosen file name
                while (inFile.hasNextLine()) { // while theres a file selected
                    line = inFile.nextLine();
                    numLines++; // add to number of lines variable
                    numChars += line.length(); // characters = line length + characters
                    numWords += new StringTokenizer(line, " ,").countTokens(); // string tokenizer delimiter = space
                }
                inFile.close(); // close file
                System.out.printf("Lines: %d\nWords: %d\nCharacters: %d\n", numLines, numWords, numChars); // print lines, words, and character
            } else { // if user did not select a file
                System.out.println("You must select a file! Terminating program..."); // print error message
                System.exit(0); // exit program
            }
        } catch (FileNotFoundException e) { // exception instance - file not found error
            System.out.println("File Not Found!"); // print file not found error
            e.printStackTrace(); // stack trace for what happened and where in the code it happened
        } catch (IOException e) { // exception instance
            System.out.println("IOException Error"); // print io exception error
            e.printStackTrace(); // stack trace for what happened and where in the code it happened
        }
    }
}