package data;

public class Grid {
    final int rows;
    final int cols;
    private final Cell[][] cells;

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

    // will reset the board per snake, food, empty -- I amy split this up into multiple functions as the full game logic becomes more clear
    public void setCellFill() {
        // variable RANDOM x2 for row / column coordinates
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // if cell fill != snake
                    // set cell fill to empty
                // whatever function eventually draws snake
                // if cell[RANDOM][RANDOM] != snake
                    // set cell[RANDOM][RANDOM] as food
            }
        }
    }
}
