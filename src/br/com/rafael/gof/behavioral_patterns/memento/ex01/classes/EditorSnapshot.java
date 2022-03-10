package br.com.rafael.gof.behavioral_patterns.memento.ex01.classes;

public class EditorSnapshot {
    private final Editor originator;
    private final String text;
    private final double x, y, selectionWidth;

    public EditorSnapshot(Editor originator, String text, double x, double y, double selectionWidth) {
        this.originator = originator;
        this.text = text;
        this.x = x;
        this.y = y;
        this.selectionWidth = selectionWidth;
    }

    public void restore() {
        originator.setText(text);
        originator.setCursor(x, y);
        originator.setSelectionWidth(selectionWidth);
    }
}
