package main;

// external resources
import java.util.Scanner;

// internal resources
import data.*;
import ui.GameDisplay;
import ui.Menu;

public class GameLoop {
    private final GameDisplay display;
    // private final Menu menu = Menu.getInstance();
    private final Grid grid;
    private final Snake snake;
    private boolean session;
    private HighScore score = HighScore.getInstance();

    public GameLoop(Grid grid, Snake snake) {
        this.display = new GameDisplay();
        this.session = true;
        this.grid = grid;
        this.snake = snake;

    }

    // start the game
    public void start(Scanner scanner) {
        // Scanner scanner = new Scanner(System.in);
        session = true;
        try {
            // Game loop, repeat until snake collides with wall or itself
            while (session) {
                // Display game, refresh each move/duration
                display.render(grid);

                // Prompt user for move, pause, or quit
                System.out.print("Enter your move: w/a/s/d or p to pause: ");

                // Prompt user to move snake
                char input = scanner.next().charAt(0);

                // Get the current location of the snake's head
                Cell head = snake.getHead();
                int row = head.getRow();
                int col = head.getCol();

                // maybe case switch
                switch (input) {
                    case 'a': // move left
                        col--;
                        break;
                    case 's': // move down
                        row++;
                        break;
                    case 'w': // move up
                        row--;
                        break;
                    case 'd': // move right
                        col++;
                        break;

                    case 'p': // pause and return to menu
                        session = false;
                        // scanner.close();
                        // menu.display();
                        break;

                    default:
                        System.out.println("Invalid input. Please enter w, a, s, or d.");
                        break;
                }

                // Check if the new location is within the grid
                if (session && col >= 0 && col < grid.getCols() && row >= 0 && row < grid.getRows()) {
                    // Get the cell at the new location
                    Cell newCell = grid.getCell(row, col);

                    // Move the snake to the new location
                    boolean isFood = snake.move(newCell);
                    if (isFood) {
                        score.addPoints(1);
                        grid.placeFood();
                    }
                } else {
                    System.out.println("Game Over");
                    session = false;
                    score.resetScore();
                    score.displayScoreBoard(scanner);
                    // menu.display();
                }
            }
        } finally {
            scanner.close();
        }
        // menu.display();
    }

    public void newGame(Grid grid, Snake snake) {
        session = true;
        new GameLoop(grid, snake);
    }

    // public void resume() {
    // session = true;
    // }
}