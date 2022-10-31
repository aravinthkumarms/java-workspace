package com.java.oops.composition.room;

public class Ceiling {
    private int height;
    private int painterColor;

    public Ceiling(int height, int painterColor) {
        this.height = height;
        this.painterColor = painterColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPainterColor() {
        return painterColor;
    }
}
