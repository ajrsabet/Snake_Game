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

    // return snake head location
    public Cell getHead() {
        return head;
    }

    // method for moving snake
    public void move(Cell cell) {
        if (cell != cells.get(1)) {
            head = cell;
            if (cell.getFill() == "empty") {
                cells.addFirst(head);
                cells.getFirst().setFill("snake");
                cells.getLast().setFill("empty");
                cells.removeLast();
            } else if (cell.getFill() == "food") {
                cells.addFirst(head);
                cells.getFirst().setFill("snake");
            }
            // if cell is snake
                // end game
        }
    }



}
