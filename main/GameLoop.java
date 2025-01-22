// This will control the flow of the game
// We can start with turn based and change it to time based later
package main;

import ui.*;

public class GameLoop {
    // Create connection to methods in other packages
    GameDisplay display = new ui.GameDisplay();
    Console console = new ui.Console();

    public GameLoop() {
        // while session == true

        // Display game, refresh each move/duration
        display.screen();

        // User movement input

        //
    }

    public void start() {

    }

    public void stop() {

    }
}
