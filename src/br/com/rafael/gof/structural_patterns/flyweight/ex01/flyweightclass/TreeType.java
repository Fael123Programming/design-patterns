package br.com.rafael.gof.structural_patterns.flyweight.ex01.flyweightclass;

//This is the flyweight class: it stores that data which is commonly shared by a multitude of
//objects from this very same class. Intrinsic state! Immutable!
import java.awt.*;
import java.util.Objects;

// The flyweight class contains a portion of the state of a
// tree. These fields store values that are unique for each
// particular tree. For instance, you won't find here the tree
// coordinates. But the texture and colors shared between many
// trees are here. Since this data is usually BIG, you'd waste a
// lot of memory by keeping it in each tree object. Instead, we
// can extract texture, color and other repeating data into a
// separate object which lots of individual tree objects can
// reference.

public class TreeType {
    private final String name, color, texture; //Using strings for simplicity's sake.
//  All the intrinsic state cannot be modified or changed.
//  That's why it is final!

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String getTexture() {
        return this.texture;
    }

    public void draw(Canvas canvas, int x, int y) {
        //1. Create a bitmap of a given type, color and texture;
        //2. Draw the bitmap on the canvas at x and y coordinates.
    }

    @Override
    public String toString() {
        return "name=" + this.name + ", color=" + this.color + ", texture=" + this.texture;
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (!(anotherObject instanceof TreeType casted))
            return false;
        return this.name.equals(casted.name) && this.color.equals(casted.color) &&
                this.texture.equals(casted.texture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.color, this.texture);
    }
}
