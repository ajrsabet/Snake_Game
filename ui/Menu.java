package ui;

// external resources
import java.util.Scanner;

// internal resources
import main.GameLoop;

public class Menu {
    public Menu() {
        System.out.println("MENU");
        System.out.println("_____________________________");
        System.out.println("1. Start new game");
        System.out.println("2. Resume current game");
        System.out.println("3. See high scores");
        System.out.println("4. Quit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Starting game...");
                // Add logic to start the game
                GameLoop gameLoop = new GameLoop();
                gameLoop.start(); // Assuming 'start' is the method to start the game loop

                break;
            case 2:
                System.out.println("Resuming current game...");
                // Add logic to start the game
                break;
            case 3:
                System.out.println("Displaying high scores...");
                // Add logic to display high scores
                break;
            case 4:
                System.out.println("Quitting...");
                // Add logic to quit the game
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                // Optionally, you can loop back to the menu
                break;
        }

        scanner.close();
    }
}