package org.codeforall.iorns;

import org.codeforall.iorns.utils.EventHandler;

public class Main {
    public static void main(String[] args) {

        MapEditor mapEditor = new MapEditor(30,30);
        new EventHandler(mapEditor);

    }
}
