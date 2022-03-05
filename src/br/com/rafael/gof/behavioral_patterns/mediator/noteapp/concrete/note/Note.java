package br.com.rafael.gof.behavioral_patterns.mediator.noteapp.concrete.note;

public class Note {
    private String name, text;

    {
        name = "New note";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return name;
    }
}
