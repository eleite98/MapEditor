package org.codeforall.iorns;

import org.codeforall.iorns.grid.Cell;
import org.codeforall.iorns.grid.Cursor;
import org.codeforall.iorns.utils.FileManager;

public class MapEditor {

    private Cursor cursor;
    private Grid grid;

    public MapEditor(int rows, int cols) {
        grid = new Grid(rows, cols);
        cursor = new Cursor();

    }

    public void moveCursor(Cursor.Moves moves) {
        if (cursorLimits(moves)) {
            return;
        }
        switch (moves) {
            case UP:
                cursor.up();
                break;
            case DOWN:
                cursor.down();
                break;
            case RIGHT:
                cursor.right();
                break;
            case LEFT:
                cursor.left();
                break;
        }
    }

    public boolean cursorLimits(Cursor.Moves moves) {
        return moves == Cursor.Moves.UP && cursor.getRow() == 0 ||
                moves == Cursor.Moves.DOWN && cursor.getRow() == grid.getRows() - 1 ||
                moves == Cursor.Moves.LEFT && cursor.getCol() == 0 ||
                moves == Cursor.Moves.RIGHT && cursor.getCol() == grid.getCols() - 1;
    }

    public void paintInBlack() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (cell.isPainted() && cell.isBlack()) {
            cell.deleteColor();
        } else {
            cell.setBlack();
        }
    }

    public void paintInRed() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (cell.isPainted() && cell.isRed()) {
            cell.deleteColor();
        } else {
            cell.setRed();
        }
    }

    public void paintInYellow(){
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (cell.isPainted() && cell.isYellow()) {
            cell.deleteColor();
        } else {
            cell.setYellow();
        }
    }

    public void paintInBlue(){
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (cell.isPainted() && cell.isBlue()) {
            cell.deleteColor();
        } else {
            cell.setBlue();
        }
    }

    public void paintInOrange() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (cell.isPainted() && cell.isOrange()) {
            cell.deleteColor();
        } else {
            cell.setOrange();
        }
    }

    public void paintInGreen() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (cell.isPainted() && cell.isGreen()) {
            cell.deleteColor();
        } else {
            cell.setGreen();
        }
    }




    public void clear(){
        grid.clearGrid();
    }

    public void load(){
         grid.stringToGrid(FileManager.readFile());

    }

    public void save(){ FileManager.writeToFile(grid.toString());}
}




