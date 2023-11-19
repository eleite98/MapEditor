package org.codeforall.iorns;

import org.codeforall.iorns.grid.Cell;

public class Grid {

    public static final int PADDING = 10;
    public static final int cellSize = 20;
    public int rows;
    public int cols;

    private Cell[][] cells; // cells array to receive the paint cells


    public Grid(int rows, int cols) {

        this.rows = rows;
        this.cols = cols;

        cells = new Cell[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                cells[row][col] = new Cell(row, col);
            }
        }
    }

    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    public int getRows() {
        return rows;
    }

    public void stringToGrid(String str) {
        int index = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Cell previousGrid = cells[row][col];

                switch (str.charAt(index)) {
                    case '0':
                        previousGrid.deleteColor();
                        break;
                    case '1':
                        previousGrid.setBlack();
                        break;
                    case '2':
                        previousGrid.setRed();
                        break;
                    case '3':
                        previousGrid.setBlue();
                        break;
                    case '4':
                        previousGrid.setYellow();
                        break;
                    case '5':
                        previousGrid.setOrange();
                        break;
                    case '6':
                        previousGrid.setGreen();

                }
                index++;
            }
        }
    }


    public int getCols() {
        return cols;
    }

    public void clearGrid() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                cells[row][col].deleteColor();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (cells[row][col].isPainted() && cells[row][col].isBlack()) {
                    string.append("1");
                } else if (cells[row][col].isPainted() && cells[row][col].isRed()) {
                    string.append("2");
                } else if (cells[row][col].isPainted() && cells[row][col].isBlue()) {
                    string.append("3");
                } else if (cells[row][col].isPainted() && cells[row][col].isYellow()) {
                    string.append("4");
                } else if (cells[row][col].isPainted() && cells[row][col].isOrange()) {
                    string.append("5");
                } else if (cells[row][col].isPainted() && cells[row][col].isGreen()) {
                    string.append("6");
                } else {
                    string.append("0");
                }
            }
        }
        return string.toString();
    }
}
