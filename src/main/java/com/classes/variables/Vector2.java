package com.classes.variables;

public class Vector2 {
    public int x = 0;
    public int y = 0;

    public Vector2() {
    }

    public Vector2(final int X, final int Y) {
        this.x = X;
        this.y = Y;
    }

    public void Add(Vector2 toAdd){
        this.x += toAdd.x;
        this.y += toAdd.y;
    }

    public void Multiply(int by){
        this.x *= by;
        this.y *= by;
    }
}