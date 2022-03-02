package br.com.rafael.gof.structural_patterns.flyweight.ex01.contextclass;

import br.com.rafael.gof.structural_patterns.flyweight.ex01.flyweightclass.TreeType;

import java.awt.*;

// The contextual object contains the extrinsic part of the tree
// state. An application can create billions of these since they
// are pretty small: just two integer coordinates and one
// reference field.

public class Tree {
    private int x, y; //Coordinates in a bitmap to draw a TreeType. The extrinsic state. Mutable.
    private final TreeType type; //The type of this tree. The intrinsic state. Immutable.

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getXCoordinate() {
        return this.x;
    }

    public void setXCoordinate(int x) {
        this.x = x;
    }

    public void setYCoordinate(int y) {
        this.y = y;
    }

    public int getYCoordinate() {
        return this.y;
    }

    public TreeType getType() {
        return this.type;
    }

    public void draw(Canvas canvas) {
        this.type.draw(canvas, this.x, this.y);
    }

    @Override
    public String toString() {
        return this.type + " at (" + this.x + ", " + this.y + ") coordinates";
    }
}
