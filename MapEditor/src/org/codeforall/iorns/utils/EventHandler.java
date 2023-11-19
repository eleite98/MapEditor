package org.codeforall.iorns.utils;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.codeforall.iorns.MapEditor;
import org.codeforall.iorns.grid.Cursor;

public class EventHandler implements KeyboardHandler {

    MapEditor mapEditor;

    public EventHandler(MapEditor mapEditor) {
        this.mapEditor = mapEditor;
        init();
    }


    public void init() {

        Keyboard kb = new Keyboard(this);

        KeyboardEvent right = new KeyboardEvent();
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        right.setKey(KeyboardEvent.KEY_RIGHT);

        kb.addEventListener(right);

        KeyboardEvent left = new KeyboardEvent();
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        left.setKey(KeyboardEvent.KEY_LEFT);

        kb.addEventListener(left);

        KeyboardEvent up = new KeyboardEvent();
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        up.setKey(KeyboardEvent.KEY_UP);

        kb.addEventListener(up);

        KeyboardEvent down = new KeyboardEvent();
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        down.setKey(KeyboardEvent.KEY_DOWN);

        kb.addEventListener(down);

        KeyboardEvent space = new KeyboardEvent();
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        space.setKey(KeyboardEvent.KEY_SPACE);

        kb.addEventListener(space);

        KeyboardEvent c = new KeyboardEvent();
        c.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        c.setKey(KeyboardEvent.KEY_C);

        kb.addEventListener(c);

        KeyboardEvent l = new KeyboardEvent();
        l.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        l.setKey(KeyboardEvent.KEY_L);

        kb.addEventListener(l);

        KeyboardEvent s = new KeyboardEvent();
        s.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        s.setKey(KeyboardEvent.KEY_S);

        kb.addEventListener(s);

        KeyboardEvent r = new KeyboardEvent();
        r.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        r.setKey(KeyboardEvent.KEY_R);

        kb.addEventListener(r);

        KeyboardEvent b = new KeyboardEvent();
        b.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        b.setKey(KeyboardEvent.KEY_B);

        kb.addEventListener(b);

        KeyboardEvent y = new KeyboardEvent();
        y.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        y.setKey(KeyboardEvent.KEY_Y);

        kb.addEventListener(y);

        KeyboardEvent o = new KeyboardEvent();
        o.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        o.setKey(KeyboardEvent.KEY_O);

        kb.addEventListener(o);

        KeyboardEvent g = new KeyboardEvent();
        g.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        g.setKey(KeyboardEvent.KEY_G);

        kb.addEventListener(g);



    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                mapEditor.moveCursor(Cursor.Moves.UP);
                break;
            case KeyboardEvent.KEY_DOWN:
                mapEditor.moveCursor(Cursor.Moves.DOWN);
                break;
            case KeyboardEvent.KEY_RIGHT:
                mapEditor.moveCursor(Cursor.Moves.RIGHT);
                break;
            case KeyboardEvent.KEY_LEFT:
                mapEditor.moveCursor(Cursor.Moves.LEFT);
                break;
            case KeyboardEvent.KEY_SPACE:
                mapEditor.paintInBlack();
                break;
            case KeyboardEvent.KEY_R:
                mapEditor.paintInRed();
                break;
            case KeyboardEvent.KEY_B:
                mapEditor.paintInBlue();
                break;
            case KeyboardEvent.KEY_Y:
                mapEditor.paintInYellow();
                break;
            case KeyboardEvent.KEY_G:
                mapEditor.paintInGreen();
                break;
            case KeyboardEvent.KEY_O:
                mapEditor.paintInOrange();
                break;
            case KeyboardEvent.KEY_C:
                mapEditor.clear();
                break;
            case KeyboardEvent.KEY_L:
                mapEditor.load();
                break;
            case KeyboardEvent.KEY_S:
                mapEditor.save();
                break;
        }
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}


