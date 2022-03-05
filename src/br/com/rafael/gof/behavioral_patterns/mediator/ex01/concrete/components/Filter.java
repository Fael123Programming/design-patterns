package br.com.rafael.gof.behavioral_patterns.mediator.ex01.concrete.components;

import br.com.rafael.gof.behavioral_patterns.mediator.ex01.abstract_.Component;
import br.com.rafael.gof.behavioral_patterns.mediator.ex01.abstract_.Mediator;
import br.com.rafael.gof.behavioral_patterns.mediator.ex01.concrete.note.Note;

import javax.swing.*;
import java.awt.event.KeyEvent;

import java.util.*;

public class Filter extends JTextField implements Component {
    private Mediator mediator;
    private ListModel<Note> listModel;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        searchElements(getText());
    }

    public void setList(ListModel<Note> listModel) {
        this.listModel = listModel;
    }

    public void searchElements(String str) {
        if (listModel == null)
            return;
        if (str.isEmpty()) {
            mediator.setElementsList(listModel);
            return;
        }
        ArrayList<Note> notes = new ArrayList<>();
        for (int i = 0; i < listModel.getSize(); i++)
            notes.add(listModel.getElementAt(i));
        DefaultListModel<Note> defaultListModel = new DefaultListModel<>();
        for (Note note : notes)
            if (note.getName().contains(str))
                defaultListModel.addElement(note);
        mediator.setElementsList(defaultListModel);
    }

    @Override
    public int getType() {
        return Component.FILTER;
    }
}
