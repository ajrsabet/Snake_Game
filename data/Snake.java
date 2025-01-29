package data;

import java.util.LinkedList;
import java.util.List;

public class Snake {
    private LinkedList<Cell> cells;
    private Cell head;

    // constructor
    public Snake(List<Cell> initialCells) {
        cells = new LinkedList<Cell>();
        for (Cell cell : initialCells) {
            cell.setFill("snake");
            cells.add(cell);
        }
        head = cells.getFirst();
    }

    // return snake head location
    public Cell getHead() {
        return head;
    }

    // method for moving snake
    public boolean move(Cell thisCell) {

        if (thisCell.getCoordinates() != cells.get(1).getCoordinates()) {
            head = thisCell;
            if (thisCell.getFill().equals("empty")) {
                cells.add(head);
                cells.getFirst().setFill("empty");
                cells.getLast().setFill("snake");
                cells.removeFirst();
                return false;
            } else if (thisCell.getFill().equals("food")) {
                cells.add(head);
                head.setFill("snake");
                return true;
            } else {
                System.out.println("Game Over");
                return false;
            }
            // if cell is snake
            // end game
        } else {
            return false;
        }
    }

}
