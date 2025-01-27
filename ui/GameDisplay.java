package ui;

import java.awt.*;
import java.util.LinkedList;

public class GameDisplay {
    private int rows = 10; // grid size (10 x 20)
    private int cols = 20;

    public GameDisplay() {
    }

    // Constructor for custom grid size
    public GameDisplay(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    /**
     * Prints the game screen to the console with the following symbols:
     * '.' -> Empty cell
     * 'O' -> Snake segment
     * '*' -> Food
     *
     * @param snakeBody LinkedList<Point> representing the snake's body
     * @param foodPos   Point representing the food's position
     */
    public void screen(LinkedList<Point> snakeBody, Point foodPos) {
        // Create a 2D array for the grid
        char[][] grid = new char[rows][cols];

        // Initialize the grid with empty cells
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = '.'; // Empty space
            }
        }

        // Place the snake on the grid
        for (Point segment : snakeBody) {
            grid[segment.y][segment.x] = 'O'; // Snake segment
        }

        // Place the food on the grid
        grid[foodPos.y][foodPos.x] = '*';

        // Print the grid to the console
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println(); // Newline after each row
        }

        System.out.println(); // Add an extra newline for better readability
    }
}
