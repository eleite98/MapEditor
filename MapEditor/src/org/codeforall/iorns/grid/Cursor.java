package org.codeforall.iorns.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.codeforall.iorns.Grid;

public class Cursor extends Cell {


    public Cursor() {
        super(1, 1);
        rectangle.setColor(Color.CYAN);
        rectangle.fill();

    }

    public enum Moves {
        UP,
        DOWN,
        RIGHT,
        LEFT
    }

    public void up(){
        row--; // update the position of our cursor
        rectangle.translate(0,-Grid.cellSize);
    }

    public void down(){
        row++; // update the position of our cursor
        rectangle.translate(0,Grid.cellSize);
    }

    public void right(){
        col++; // update the position of our cursor
        rectangle.translate(Grid.cellSize,0);
    }

    public void left(){
        col--; // update the position of our cursor
        rectangle.translate(-Grid.cellSize,0);
    }



}
