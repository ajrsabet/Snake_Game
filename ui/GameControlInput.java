// This will handle the console display and all user input. This may
// split into multiple parts when we develop the GUI
package ui;

// external resources
import java.util.Scanner;

// internal resources

public class GameControlInput {
    // I'm not sure that we can use arrow input in the console so
    // we may need to use A (left turn), W (forward), D (right turn)

    public GameControlInput() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for move, pause, or quit
        System.out.print("Enter your choice: ");
        char input = scanner.next().charAt(0);

        // maybe case switch
        switch (input) {
            case 'a': // move left

                break;

            case 'w': // move forward

                break;

            case 'd': // move right

                break;

            case 'p': // pause and return to menu
                new Menu();

                break;

            default:
                break;
        }

        scanner.close();
    }
}
