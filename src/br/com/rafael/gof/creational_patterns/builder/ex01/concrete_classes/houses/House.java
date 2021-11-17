package br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.houses;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements.*;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.Color;
import java.util.ArrayList;

public class House {
    private ArrayList<Room> rooms;
    private Roof roof;
    private Floor floor;
    private Color externalColor;

    public House(Roof roof, Floor floor, Color externalColor) {
        this.rooms = new ArrayList<>();
        this.roof = roof;
        this.floor = floor;
        this.externalColor = externalColor;
    }

    public House(){}

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Color getExternalColor() {
        return externalColor;
    }

    public void setExternalColor(Color externalColor) {
        this.externalColor = externalColor;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", roof=" + roof +
                ", floor=" + floor +
                ", externalColor=" + externalColor +
                '}';
    }
}
