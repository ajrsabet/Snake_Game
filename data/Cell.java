package data;

public class Cell {
    private final int row;
    private final int col;
    private String fill;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.fill = "empty";
    }

    // returns value of cells row
    public int getRow() {
        return row;
    }
    // returns value of cells column
    public int getCol() {
        return col;
    }

    //returns fill value of cell (empty, food, snake)
    public String getFill() {
        return fill;
    }

    // sets fill (called from Board class)
    public void setFill(String fill) {
        this.fill = fill;
    }
}

