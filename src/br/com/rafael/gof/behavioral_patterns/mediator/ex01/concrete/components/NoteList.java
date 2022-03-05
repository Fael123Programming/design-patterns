package br.com.rafael.gof.behavioral_patterns.mediator.ex01.concrete.components;

import br.com.rafael.gof.behavioral_patterns.mediator.ex01.abstract_.*;
import br.com.rafael.gof.behavioral_patterns.mediator.ex01.concrete.note.Note;

import javax.swing.*;

public class NoteList extends JList<Note> implements Component {
    private Mediator mediator;
    private final DefaultListModel<Note> LIST_MODEL;

    public NoteList(DefaultListModel<Note> listModel) {
        super(listModel);
        LIST_MODEL = listModel;
        setModel(listModel);
        setLayoutOrientation(JList.VERTICAL);
        NoteList thisList = this;
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(300);
                } catch(InterruptedException ignore) {}
                mediator.hideElements(thisList.isSelectionEmpty());
            }
        }).start();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void addElement(Note note) {
        LIST_MODEL.addElement(note);
        int index = LIST_MODEL.getSize() - 1;
        setSelectedIndex(index);
        ensureIndexIsVisible(index);
        mediator.sendToFilter(LIST_MODEL);
    }

    public void deleteElement() {
        try {
            LIST_MODEL.remove(getSelectedIndex());
            mediator.sendToFilter(LIST_MODEL);
        } catch(ArrayIndexOutOfBoundsException ignore) {}
    }

    public Note getCurrentElement() {
        return getSelectedValue();
    }

    @Override
    public int getType() {
        return Component.NOTE_LIST;
    }
}
