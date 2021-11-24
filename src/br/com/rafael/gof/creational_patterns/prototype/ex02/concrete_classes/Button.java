package br.com.rafael.gof.creational_patterns.prototype.ex02.concrete_classes;

import br.com.rafael.gof.creational_patterns.prototype.ex02.interface_.Prototype;

public class Button implements Prototype {
    private double x, y;
    private String color;

    public Button(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Button(Button prototype) {
        this.x = prototype.x;
        this.y = prototype.y;
        this.color = prototype.color;
    }

    public String getColor() {
        return color;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public Prototype cloneThis() {
        return new Button(this);
    }
}
