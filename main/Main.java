// This is the main entry point of the program. It initializes the game by displaying a 
// welcome message and then calling the Menu class to present the main menu options to the user.

package main;

// import java.util.ArrayList;
// import java.util.List;

// internal resources
// import data.*;
import ui.Menu;
import util.TypeWriter;

public class Main {

    public static void main(String[] args) {
        TypeWriter print = new TypeWriter();
        print.SlowType("\nWelcome to Snake! The best video game in the world!\n");

        Menu menu = Menu.getInstance();
        menu.display();

        /////////////////////////// bypass menu ///////////////////////////////////
        // Grid grid = new Grid(15, 20);
        // Snake snake;
        // GameLoop gameLoop;

        // // initialize the snake with 3 cells
        // List<Cell> initialCells = new ArrayList<>();
        // initialCells.add(grid.getCells()[4][4]);
        // initialCells.add(grid.getCells()[4][5]);
        // initialCells.add(grid.getCells()[4][6]);
        // snake = new Snake(initialCells);

        // // Place the first instance of food
        // grid.placeFood();

        // gameLoop = new GameLoop(grid, snake);
        // gameLoop.newGame(grid, snake);

        //////////////////////////////////////////////////////////////////////////////
    }

}