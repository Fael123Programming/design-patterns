package br.com.rafael.gof.behavioral_patterns.memento.ex01.classes;

public class Editor {
    private String text;
    private double x, y, selectionWidth;

    public Editor(String text, double x, double y, double selectionWidth) {
        this.text = text;
        this.x = x;
        this.y = y;
        this.selectionWidth = selectionWidth;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCursor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setSelectionWidth(double selectionWidth) {
        this.selectionWidth = selectionWidth;
    }

    public EditorSnapshot save() {
        return new EditorSnapshot(this, text, x, y, selectionWidth);
    }
}
