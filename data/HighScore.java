package data;

import java.lang.reflect.Type;
// external resources
import java.util.Scanner;

// internal resources
import ui.Menu;
import util.TypeWriter;

public class HighScore {
    private static final HighScore instance = new HighScore();
    private static final TypeWriter print = new TypeWriter();
    private final int[] scoreBoard = { 5, 4, 3, 2, 1 };

    private HighScore() {
        // Private constructor to prevent instantiation
    }

    public static HighScore getInstance() {
        return instance;
    }

    public void display() {
        Scanner input = new Scanner(System.in);
        // List high scores for session
        print.SlowType("High Score List: ");
        for (int i = 0; i < scoreBoard.length; i++) {
            print.SlowType((i + 1) + ": " + scoreBoard[i]);
        }
        print.SlowType("Enter any key to return to the menu: ");
        input.nextLine();
        new Menu();
        input.close();
    }

    // Test new score to see if it makes it on the score board
    public void TestScore(int score) {
        // int[] testScores = new int[5];
        // check each existing score to see if the new score beats it
        for (int i = 0; i < scoreBoard.length; i++) {
            if (score > scoreBoard[i]) {
                // testScores[i] = score;
                // move each of the trailing scores down the list
                // starting with the last one.
                for (int j = 4; j > scoreBoard.length - i; j--) {
                    scoreBoard[j] = scoreBoard[j + 1];
                }
                // record new score
                scoreBoard[i] = score;
                break;
            }
        }
    }
}
