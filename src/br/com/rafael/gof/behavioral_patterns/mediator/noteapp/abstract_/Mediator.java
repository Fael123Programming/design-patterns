package br.com.rafael.gof.behavioral_patterns.mediator.noteapp.abstract_;

import br.com.rafael.gof.behavioral_patterns.mediator.noteapp.concrete.note.Note;

import javax.swing.*;

public interface Mediator {
    void addNewNote(Note note);

    void deleteNote();

    void getInfoFromList(Note note);

    void saveChanges();

    void markNote();

    void clear();

    void sendToFilter(ListModel<Note> listModel);

    void setElementsList(ListModel<Note> list);

    void registerComponent(Component component);

    void hideElements(boolean flag);

    void createGUI();
}
