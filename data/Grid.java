package data;

public class Grid {
    final int rows;
    final int cols;
    private final Cell[][] cells;

    // constructor
    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        cells = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    // returns memory address of all cells on board
    public Cell[][] getCells() {
        return cells;
    }

    // returns a string of what a particular cell is filled to
    public String getCellFill(int row, int col) {
        return cells[row][col].getFill();
    }

    // sets a cell to be food
    public void setCellFill() {
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        while (x >= 10 || y >= 10) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);
        }
        if (cells[x][y].getFill() == "empty") {
            cells[x][y].setFill("food");
        } else {
            setCellFill();
        }
    }
}
