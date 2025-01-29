package data;

// external resources
// import java.lang.reflect.Type;
import java.util.Scanner;

// internal resources
import ui.Menu;
import util.TypeWriter;

public class HighScore {
    private static final HighScore instance = new HighScore();
    private static final TypeWriter print = new TypeWriter();
    private int[] scoreBoard = new int[5];
    private int[] tempBoard = new int[5];
    private int currentScore;

    private HighScore() {
        // Private constructor to prevent instantiation
        this.currentScore = 0;
    }

    public static HighScore getInstance() {
        return instance;
    }

    public void displayScoreBoard(Scanner input) {
        // Scanner input = new Scanner(System.in);
        // List high scores for session
        print.SlowType("High Score List: ");

        int[] thisBoard = new int[5];
        // determine which board to use
        if (currentScore > 0) {
            thisBoard = tempBoard;
        } else {
            thisBoard = scoreBoard;
        }
        for (int i = 0; i < thisBoard.length; i++) {
            if (currentScore == thisBoard[i]) {
                print.SlowType((i + 1) + ": " + thisBoard[i] + " current score");
            } else {
                print.SlowType((i + 1) + ": " + thisBoard[i]);
            }
        }
        print.SlowType("Enter any key to return to the menu: ");
        input.nextLine();
        Menu.getInstance();
        // input.close();
    }

    // Test new score to see if it makes it on the score board
    public void TestScore(int currentScore) {
        int[] thisBoard = new int[5];
        // determine which board to use
        if (currentScore > 0) {
            thisBoard = tempBoard;
        } else {
            thisBoard = scoreBoard;
        }

        // check each existing score to see if the new score beats it
        outerLoop: for (int i = 0; i < thisBoard.length; i++) {
            if (currentScore > thisBoard[i]) {
                print.SlowType("Congratulations! You made the high score list!");
                // move each of the trailing scores down the list
                // starting with the last one.
                for (int j = 4; j > thisBoard.length - i; j--) {
                    thisBoard[j] = thisBoard[j + 1];
                }
                // record new score
                thisBoard[i] = currentScore;
                break outerLoop;
            }
        }

        // set the new score board
        if (currentScore > 0) {
            tempBoard = thisBoard;
        } else {
            scoreBoard = thisBoard;
        }
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void addPoints(int addPoint) {
        this.currentScore += addPoint;
        TestScore(currentScore);
    }

    public void resetScore() {
        currentScore = 0;
    }
}
