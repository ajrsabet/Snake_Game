package data;

import java.util.Random;

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

    // returns memory address of all cells on board
    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    // Returns the number of rows
    public int getRows() {
        return rows;
    }

    // Returns the number of columns
    public int getCols() {
        return cols;
    }

    // returns a string of what a particular cell is filled to
    public String getCellFill(int row, int col) {
        return cells[row][col].getFill();
    }

    // Sets a cell to be food at a random empty position
    public void placeFood() {
        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(rows);
            col = random.nextInt(cols);
        } while (!cells[row][col].getFill().equals("empty"));
        cells[row][col].setFill("food");
    }

    public void setCellFill() {
        int x = (int) (Math.random() * rows);
        int y = (int) (Math.random() * cols);
        while (cells[x][y].getFill().equals("snake")) {
            x = (int) (Math.random() * rows);
            y = (int) (Math.random() * cols);
        }
        cells[x][y].setFill("food");
    }
}
