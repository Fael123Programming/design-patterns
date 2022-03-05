package br.com.rafael.gof.behavioral_patterns.mediator.ex01.noteapp;

import br.com.rafael.gof.behavioral_patterns.mediator.ex01.abstract_.Mediator;
import br.com.rafael.gof.behavioral_patterns.mediator.ex01.concrete.components.*;
import br.com.rafael.gof.behavioral_patterns.mediator.ex01.concrete.mediator.Editor;

import javax.swing.*;

public class NoteApp {
    private final Mediator mediator;
    private boolean on;
    {
        mediator = new Editor();
    }

    public NoteApp() {
        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new NoteList(new DefaultListModel<>()));
        mediator.registerComponent(new Filter());
    }

    public void init() {
        if (on)
            return;
        this.mediator.createGUI();
        on = true;
    }
}
