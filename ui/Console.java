// This will handle the console display and all user input. This may
// split into multiple parts when we develop the GUI
package ui;

public class Console {
    // Prompt user to start game or see high score

    // Prompt user for move, pause, or quit
    // I'm not sure that we can use arrow input in the console so
    // we may need to use A (left turn), W (forward), D (right turn)
    public void Move(char ch) {
        // maybe case switch
        switch (ch) {
            case 'a': // move left

                break;

            case 'w': // move forward

                break;

            case 'd': // move right

                break;

            case 'p': // pause and return to menu

                break;

            default:
                break;
        }
    }

    // display menu
    public void Menu() {

    }
}
