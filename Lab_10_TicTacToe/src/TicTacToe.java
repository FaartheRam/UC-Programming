import java.util.Scanner;
public class TicTacToe {

    private static final int ROW = 3; // set row count to 3
    private static final int COL = 3; // set column count to 3
    private static String board[][] = new String[ROW][COL]; // declare the board array

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //import scanner
        int games = 0;
        int row; // rows
        int col; // columns
        String P1 = "Player 1"; // set P1 to Player 1
        String P2 = "Player 2"; // set P2 to Player 2
        String player1 = " X "; // set player 1 to X
        String player2 = " O "; // set player 2 to O
        String currentPlayer = player1;
        String currentPlayerString;
        int moves;

        /* testing sandbox */
//        clearBoard();
//        board[0][0] = "   ";    board[0][1] = "   ";    board[0][2] = "   ";
//        board[1][0] = "   ";    board[1][1] = "   ";    board[1][2] = "   ";
//        board[2][0] = "   ";    board[2][1] = "   ";    board[2][2] = "   ";
//        display();
//        System.out.println(isWinPossibleRow(currentPlayer));

        do {
            games++;
            moves = 0;
            clearBoard();
            display();
            for (int i = 0; i < 9; i++) { // maximum 9 turns for 9 spaces on the board
                if (i % 2 == 0) {
                    currentPlayer = player1; // current player is 1 to start
                    currentPlayerString = P1; // set current player string to P1
                } else {
                    currentPlayer = player2; // player 2 is after player 1
                    currentPlayerString = P2; // set current player string to P2
                }
                System.out.printf("\n%s, it's your turn!\n", currentPlayerString); // Read out current turn to current player
                do {
                    row = SafeInput.getRangedInt(in, "Enter your row coordinate", 1, 3) - 1; // ask current player to input row
                    col = SafeInput.getRangedInt(in, "Enter your column coordinate", 1, 3) - 1; // ask current player to input column
                } while (!isValidMove(row, col)); // while a valid input
                moves += 1; // add 1 to move counter
                board[row][col] = currentPlayer; // add row and column input to board
                display(); // display input

                if (moves >= 5) { // checks win/tie conditions after the 5th turn
                    if (isWin(currentPlayer)) { // if current player wins
                        System.out.printf("%s wins!", currentPlayerString); // display win message with current winner
                        break; // break loop
                    } else if (moves >= 7) { // if greater than or equal to 7 moves
                        if (isTie()) { // its a tie
                            System.out.println("TIE GAME!"); // output tie game message
                            break; // break loop
                        }
                    }
                }
            }
            // toggle X/O at the end of the game
            if (player1.equals(" X ")) {
                player1 = " O ";
                player2 = " X ";
            } else {
                player1 = " X ";
                player2 = " O ";
            }
        } while (SafeInput.getYNConfirm(in, "Would you like to play again")); // ask for play again
        System.out.printf("You played %d game(s).\n", games); // display amount of games played
    }

    /* clears board */
    private static void clearBoard() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                board[i][j] = "   "; // reset every slot
            }
        }
    }

    // displays tic tac toe board
    private static void display() { // display board
        String displayBoard = "";
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (j == COL - 1) { // draw rows
                    displayBoard += board[i][j]; // don't append a pipe for column 3
                } else {
                    displayBoard += board[i][j] + "|"; // append pipe after columns
                }
            }
            if (i != ROW - 1) { // dividers between rows
                displayBoard += "\n---+---+---\n";
            }
        }
        System.out.println(displayBoard); // display board
    }

    /**
     * @param row an integer representing the row
     * @param col an integer representing the column
     * @return true if valid move
     */
    private static boolean isValidMove(int row, int col) { // check to see if given move coordinates are valid
        return (board[row][col].equals("   "));
    }

    /**
     * @param player a string that represents the player
     * @return true column win condition
     */
    private static boolean isColWin(String player) { // check for column with for specified player
        for (int col = 0; col < COL; col++) {
            if (board[0][col].equals(player) && board[1][col].equals(player) && board[2][col].equals(player)) {
                return true; // return true if specified player wins on column
            }
        }
        return false; // no win
    }

    /**
     * @param player a string that represents the player
     * @return true row win condition
     */
    private static boolean isRowWin(String player) { // check for row win for specified player
        for (int row = 0; row < ROW; row++) {
            if (board[row][0].equals(player) && board[row][1].equals(player) && board[row][2].equals(player)) {
                return true; // return true if specified player wins on row
            }
        }
        return false; // no win
    }

    /**
     * @param player a string that represents the player
     * @return true diagonal win condition
     */
    private static boolean isDiagonalWin(String player) { // check for diagonal win for specified player
        if ((board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) ||
                (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player))){ // both diagonal directions
            return true; // return ture if specified player wins on either diagonal
        } else {
            return false; // no win
        }
    }

    /**
     * @param player a string that represents the player
     * @return true if one of the win conditions are true
     */
    private static boolean isWin(String player) { // did a player win
        if (isColWin(player) || isRowWin(player) || isDiagonalWin(player)) { // if any of the checked booleans are ture
            return true; // set boolean to true - specified player wins
        } else {
            return false; // no win
        }
    }

    /**
     * @return true if tie occurs
     */
    private static boolean isTie() { // if no player has a win and not enough moves/spaces left to win
        int count = 0;
        if (isTieRows()) { // check rows
            count++; // add to count
        }
        if (isTieCols()) { // check columns
            count++; // add to count
        }
        if (isTieDiagDown()) { // check diagonals
            count++; // add to count
        }
        if (isTieDiagUp()) { // check diagonals
            count++; // add to count
        }

        if (count >= 3) { // if count is greater than or equal to 3
            return true; // set Tie to true
        }
        return false; // no tie
    }

    /**
     * @return true if there is at least an X and O in every row
     */
    private static boolean isTieRows() {
        int countX = 0;
        int countO = 0;
        int numDeadWinVectors = 0;
        for (int i = 0; i < ROW; i++) {
            countX = 0;
            countO = 0;
            for (int j = 0; j < COL; j++) {
                if (board[i][j].equals(" X ")) {
                    countX++;
                } else if (board[i][j].equals(" O ")) {
                    countO++;
                }
                if (countX >= 1 && countO >= 1) {
                    numDeadWinVectors++;
                }
            }
        }
        if (numDeadWinVectors >= 3) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return true if there is at least an X and O in every column
     */
    private static boolean isTieCols() {
        int countX = 0;
        int countO = 0;
        int numDeadWinVectors = 0;
        for (int i = 0; i < ROW; i++) {
            countX = 0;
            countO = 0;
            for (int j = 0; j < COL; j++) {
                if (board[j][i].equals(" X ")) {
                    countX++;
                } else if (board[j][i].equals(" O ")) {
                    countO++;
                }
                if (countX >= 1 && countO >= 1) {
                    numDeadWinVectors++;
                }
            }
        }
        if (numDeadWinVectors >= 3) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return true if there is an X and O in the diagonal down
     */
    private static boolean isTieDiagDown() {
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < ROW; i++) {
            if (board[i][i].equals(" X ")) {
                countX++;
            } else if (board[i][i].equals(" O ")) {
                countO++;
            }
        }
        if (countX >= 1 && countO >= 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return true if there is an X and O in the diagonal up
     */
    private static boolean isTieDiagUp() {
        int countX = 0;
        int countO = 0;
        if (board[0][2].equals(" X ")) {
            countX++;
        } else if (board[0][2].equals(" O ")) {
            countO++;
        }
        if (board[1][1].equals(" X ")) {
            countX++;
        } else if (board[1][1].equals(" O ")) {
            countO++;
        }
        if (board[2][0].equals(" X ")) {
            countX++;
        } else if (board[2][0].equals(" O ")) {
            countO++;
        }
        if (countX >= 1 && countO >= 1) {
            return true;
        } else {
            return false;
        }
    }
}