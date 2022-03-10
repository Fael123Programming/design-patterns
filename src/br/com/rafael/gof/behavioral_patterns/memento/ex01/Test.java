package br.com.rafael.gof.behavioral_patterns.memento.ex01;

import br.com.rafael.gof.behavioral_patterns.memento.ex01.classes.Command;
import br.com.rafael.gof.behavioral_patterns.memento.ex01.classes.Editor;

public class Test {
    public static void main(String[] args) {
        Editor editor = new Editor("Sample phrase inside a text editor", 125, 340, 5.6);
        Command c = new Command(editor); //Integrating the pattern with command!
        editor.setCursor(600, 900);
        editor.setText("New text");
        editor.setSelectionWidth(10.34);
        c.undo();
        System.out.println(editor.getText());
    }
}
