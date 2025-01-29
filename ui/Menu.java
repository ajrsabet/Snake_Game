// This class represents the main menu of the game. It provides options to start a new game, 
// resume a current game, view high scores, or quit the program. The menu is displayed 
// using a typewriter effect for better user experience.
package ui;

// external resources
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// internal resources
import main.GameLoop;
import util.TypeWriter;
import data.*;

public class Menu {
    // Create connection to methods in other packages
    private final HighScore highScore = HighScore.getInstance();
    private static final Menu instance = new Menu();
    private final TypeWriter print = new TypeWriter();
    private final Grid grid = new Grid(10, 15);
    private final Snake snake;
    private final GameLoop gameLoop;
    private boolean session = true;
    private Scanner input;
    // private boolean currentGame = false;

    // Constructor
    private Menu() {
        // initialize the snake with 3 cells
        List<Cell> initialCells = new ArrayList<>();
        initialCells.add(grid.getCells()[4][4]);
        initialCells.add(grid.getCells()[4][5]);
        initialCells.add(grid.getCells()[4][6]);
        snake = new Snake(initialCells);

        // Place the first instance of food
        grid.placeFood();

        gameLoop = new GameLoop(grid, snake);
    }

    public static Menu getInstance() {
        return instance;
    }

    public void display() {
        input = new Scanner(System.in);
        while (session) {

            print.SlowType("\nMENU");
            print.SlowType("_____________________________\n");
            print.SlowType("1. Start game/resume current game");
            print.SlowType("2. See high scores");
            print.SlowType("3. Quit Program\n");

            print.SlowType("Enter your choice: \n");
            int option = input.nextInt();

            switch (option) {
                case 1: // New Game

                    print.SlowType("Starting game...\n");

                    gameLoop.start(input); // Assuming 'start' is the method to start the game loop

                    break;
                case 2: // See High Score
                    highScore.displayScoreBoard(input);
                    print.SlowType("Enter any key to return to the menu: ");
                    input.nextLine();
                    display();
                    break;
                case 3: // Quit Program
                    print.SlowType("Thanks for playing the Snake game! Goodbye!\n");
                    System.exit(0);
                    break;
                default:
                    print.SlowType("Invalid choice. Please try again.\n");
                    // Optionally, you can loop back to the menu
                    display();
                    break;
            }

        }
        input.close();
    }
}