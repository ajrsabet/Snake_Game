// This will control the flow of the game
// We can start with turn based and change it to time based later
package main;

// external resources
import javafx.scene.control.Menu;

// internal resources
import ui.*;

public class GameLoop {
    // Create connection to methods in other packages
    GameDisplay display = new ui.GameDisplay();
    GameControlInput input = new ui.GameControlInput();
    boolean session = true;

    public GameLoop() {
        // Game loop, repeat until snake collides with wall or itself
        while (session == true) {
            // Display game, refresh each move/duration
            display.screen();
            // User movement input
            input = new ui.GameControlInput();
            // Move snake forward one space in direction of movement

            // Check for collision with wall or itself
            // If collision, end game and return to menu
            // session = false;
            // If no collision, continue game loop

        }
        new Menu();
    }

    public void start() {

    }

    public void pause() {
        new Menu();
    }

}
