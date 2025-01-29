package ui;

// external resources
// import java.awt.*;

// internal resources
import data.Grid;
import data.HighScore;

public class GameDisplay {
    private final HighScore highScore = HighScore.getInstance();

    // Constructor
    public GameDisplay() {
    }

    // Display the grid to the console
    public void render(Grid grid) {
        // Get the grid cells
        int rows = grid.getRows();
        int cols = grid.getCols();
        char cellFill = ' ';

        // Print the grid to the console
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid.getCellFill(i, j) == "snake") {
                    cellFill = 'O';
                } else if (grid.getCellFill(i, j) == "food") {
                    cellFill = 'X';
                } else {
                    cellFill = '.';
                }

                System.out.print(cellFill + " ");
            }
            System.out.println(); // Newline after each row
        }

        System.out.println("Score: " + highScore.getCurrentScore()); // Add an extra newline for better readability
    }
}