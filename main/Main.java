// This is the main entry point of the program. It initializes the game by displaying a 
// welcome message and then calling the Menu class to present the main menu options to the user.

package main;

// internal resources
import ui.Menu;
import util.TypeWriter;

public class Main {
    public static void main(String[] args) {
        TypeWriter print = new TypeWriter();
        print.SlowType("\nWelcome to Snake! The best video game in the world!\n");

        new Menu();
    }
}