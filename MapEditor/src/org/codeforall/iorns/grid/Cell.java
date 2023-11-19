package org.codeforall.iorns.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.codeforall.iorns.Grid;

public class Cell {

    int row;
    int col;
    Rectangle rectangle;
    private boolean isPainted;
    private boolean isBlack;
    private boolean isRed;
    private boolean isBlue;
    private boolean isYellow;
    private boolean isOrange;
    private boolean isGreen;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        rectangle = new Rectangle(col * Grid.cellSize + Grid.PADDING, row * Grid.cellSize + Grid.PADDING, Grid.cellSize, Grid.cellSize);
        rectangle.draw();
    }


    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public boolean isRed() {
        return isRed;
    }

    public boolean isPainted() {
        return isPainted;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public boolean isYellow() {
        return isYellow;
    }

    public boolean isOrange(){return isOrange;}

    public boolean isGreen(){return isGreen;}

    public void setBlack(){
        rectangle.setColor(Color.BLACK);
        rectangle.draw();
        rectangle.fill();
        isPainted = true;
        isBlack = true;

    }

    public void setRed(){
        rectangle.setColor(Color.RED);
        rectangle.fill();
        isPainted = true;
        isRed = true;
    }

    public void setYellow(){
        rectangle.setColor(Color.YELLOW);
        rectangle.fill();
        isPainted = true;
        isYellow = true;
    }

    public void setBlue(){
        rectangle.setColor(Color.BLUE);
        rectangle.fill();
        isPainted = true;
        isBlue = true;
    }

    public void setOrange(){
        rectangle.setColor(Color.ORANGE);
        rectangle.fill();
        isPainted = true;
        isOrange = true;
    }

    public void setGreen(){
        rectangle.setColor(Color.GREEN);
        rectangle.fill();
        isPainted = true;
        isGreen = true;
    }


    public void deleteColor(){
        isPainted = false;
        rectangle.setColor(Color.BLACK);
        rectangle.draw();
    }



}