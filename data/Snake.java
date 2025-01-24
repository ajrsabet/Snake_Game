package data;

import java.util.LinkedList;

public class Snake {
    private LinkedList<Cell> cells;
    private Cell head;
    
    // constructor
    public Snake(Cell initial) {
        cells = new LinkedList<Cell>();
        head = initial;
        cells.add(head);
    }

    // method for moving snake
    public void move(Cell cell) {
        // head = cell
        // if head == cells[1]
            // return? (do nothing)
        // if cell is empty
            // add cell to snake
            // remove tail
        // if cell is food
            // add cell to snake
        // if cell is snake
            // end game

        updateGrid();
    }

    public void updateGrid() {
        // for each cell in snake
            // set cell fill to snake
    }


}
