package ui;

// external resources
import java.util.Scanner;

// internal resources
import main.GameLoop;
import util.TypeWriter;
import data.HighScore;

public class Menu {
    public Menu() {
        TypeWriter print = new TypeWriter();
        print.SlowType("\nMENU");
        print.SlowType("_____________________________\n");
        print.SlowType("1. Start new game");
        print.SlowType("2. Resume current game");
        print.SlowType("3. See high scores");
        print.SlowType("4. Quit Program\n");

        Scanner scanner = new Scanner(System.in);
        print.SlowType("Enter your choice: \n");
        int input = scanner.nextInt();

        switch (input) {
            case 1: // New Game
                print.SlowType("Starting game...\n");
                // Add logic to start the game
                GameLoop gameLoop = new GameLoop();
                gameLoop.start(); // Assuming 'start' is the method to start the game loop

                break;
            case 2: // Resume Current Game
                print.SlowType("Resuming current game...\n");
                // Add logic to start the game
                break;
            case 3: // See High Score
                print.SlowType("Displaying high scores...\n");
                HighScore highScore = new HighScore();
                // Add logic to display high scores
                break;
            case 4: // Quit Program
                print.SlowType("Thanks for playing the Snake game! Goodbye!\n");
                System.exit(0);
                break;
            default:
                print.SlowType("Invalid choice. Please try again.\n");
                // Optionally, you can loop back to the menu
                new Menu();
                break;
        }

        scanner.close();
    }
}