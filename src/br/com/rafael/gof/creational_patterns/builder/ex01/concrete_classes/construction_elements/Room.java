package br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.Color;

public class Room {
    private Color color;
    private int doors, windows;

    public Room(Color color, int doors, int windows) {
        this.color = color;
        this.doors = doors;
        this.windows = windows;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "Room{" +
                "color=" + color +
                ", doors=" + doors +
                ", windows=" + windows +
                '}';
    }
}
