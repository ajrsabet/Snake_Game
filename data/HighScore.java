package data;

// external resources
import java.util.Scanner;

// internal resources

public class HighScore {
    // private int[] scoreBoard = new int[5];
    private int[] scoreBoard = { 5, 4, 3, 2, 1 };

    public HighScore() {
        Scanner input = new Scanner(System.in);
        // List high scores for session
        System.out.println("High Score List: ");
        for (int i = 0; i < scoreBoard.length; i++) {
            System.out.println((i + 1) + ": " + scoreBoard[i]);
        }

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
