package br.com.rafael.gof.behavioral_patterns.mediator.noteapp.concrete.mediator;

import br.com.rafael.gof.behavioral_patterns.mediator.noteapp.abstract_.Component;
import br.com.rafael.gof.behavioral_patterns.mediator.noteapp.abstract_.Mediator;
import br.com.rafael.gof.behavioral_patterns.mediator.noteapp.concrete.components.AddButton;
import br.com.rafael.gof.behavioral_patterns.mediator.noteapp.concrete.components.DeleteButton;
import br.com.rafael.gof.behavioral_patterns.mediator.noteapp.concrete.components.SaveButton;
import br.com.rafael.gof.behavioral_patterns.mediator.noteapp.concrete.components.Filter;
import br.com.rafael.gof.behavioral_patterns.mediator.noteapp.concrete.components.NoteList;
import br.com.rafael.gof.behavioral_patterns.mediator.noteapp.concrete.note.Note;
import br.com.rafael.gof.behavioral_patterns.mediator.noteapp.concrete.components.TextBox;
import br.com.rafael.gof.behavioral_patterns.mediator.noteapp.concrete.components.Title;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Editor implements Mediator {
    private Title title;
    private TextBox textBox;
    private AddButton addButton;
    private DeleteButton deleteButton;
    private SaveButton saveButton;
    private NoteList noteList;
    private Filter filter;
    private final JLabel titleLabel, textLabel, instructionsLabel;

    {
        titleLabel = new JLabel("Title: ");
        textLabel = new JLabel("Text: ");
        instructionsLabel = new JLabel("Add or select existing note to proceed...");
    }

    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);
        switch(component.getType()) {
            case Component.ADD_BUTTON -> addButton = (AddButton) component;
            case Component.DELETE_BUTTON -> deleteButton = (DeleteButton) component;
            case Component.SAVE_BUTTON -> saveButton = (SaveButton) component;
            case Component.FILTER -> filter = (Filter) component;
            case Component.TEXT_BOX -> textBox = (TextBox) component;
            case Component.TITLE -> title = (Title) component;
            case Component.NOTE_LIST -> {
                noteList = (NoteList) component;
                noteList.addListSelectionListener(listSelectionEvent -> {
                    Note note = noteList.getSelectedValue();
                    if (note == null)
                        clear();
                    else
                        getInfoFromList(note);
                });
            }
        }
    }

    @Override
    public void addNewNote(Note note) {
        clear();
        noteList.addElement(note);
    }

    @Override
    public void deleteNote() {
        noteList.deleteElement();
    }

    @Override
    public void getInfoFromList(Note note) {
        title.setText(note.getName().replace('*', ' '));
        textBox.setText(note.getText());
    }

    @Override
    public void saveChanges() {
        try {
            Note note = noteList.getSelectedValue();
            note.setName(title.getText());
            note.setText(textBox.getText());
            noteList.repaint();
        } catch(NullPointerException ignore) {}
    }

    @Override
    public void markNote() {
        try {
            Note note = noteList.getCurrentElement();
            String name = note.getName();
            if (!name.endsWith("*"))
                note.setName(name + "*");
            noteList.repaint();
        } catch(NullPointerException ignore) {}
    }

    @Override
    public void clear() {
        title.setText("");
        textBox.setText("");
    }

    @Override
    public void sendToFilter(ListModel<Note> listModel) {
        filter.setList(listModel);
    }

    @Override
    public void setElementsList(ListModel<Note> listModel) {
        noteList.setModel(listModel);
        noteList.repaint();
    }

    @Override
    public void hideElements(boolean flag) {
        titleLabel.setVisible(!flag);
        textLabel.setVisible(!flag);
        title.setVisible(!flag);
        textBox.setVisible(!flag);
        saveButton.setVisible(!flag);
        instructionsLabel.setVisible(!flag);
    }

    @Override
    public void createGUI() {
        JFrame notes = new JFrame("Notes");
        notes.setSize(960, 600);
        notes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(new LineBorder(Color.BLACK));
        leftPanel.setSize(320, 600);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        JPanel filterPanel = new JPanel();
        filterPanel.add(new JLabel("Filter: "));
        filter.setColumns(20);
        filterPanel.add(filter);
        filterPanel.setPreferredSize(new Dimension(280, 40));
        JPanel listPanel = new JPanel();
        noteList.setFixedCellWidth(260);
        listPanel.setSize(320, 470);
        JScrollPane scrollPane = new JScrollPane(noteList);
        scrollPane.setPreferredSize(new Dimension(275, 410));
        listPanel.add(scrollPane);
        JPanel buttonPanel = new JPanel();
        addButton.setPreferredSize(new Dimension(85, 25));
        buttonPanel.add(addButton);
        deleteButton.setPreferredSize(new Dimension(85, 25));
        buttonPanel.add(deleteButton);
        buttonPanel.setLayout(new FlowLayout());
        leftPanel.add(filterPanel);
        leftPanel.add(listPanel);
        leftPanel.add(buttonPanel);
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setSize(640, 600);
        rightPanel.setLocation(320, 0);
        rightPanel.setBorder(new LineBorder(Color.BLACK));
        titleLabel.setBounds(20, 4, 50, 20);
        title.setBounds(60, 5, 555, 20);
        textLabel.setBounds(20, 5, 50, 130);
        textBox.setBorder(new LineBorder(Color.DARK_GRAY));
        textBox.setBounds(20, 80, 595, 410);
        saveButton.setBounds(270, 535, 80, 25);
        instructionsLabel.setFont(new Font("Verdana", Font.PLAIN, 22));
        instructionsLabel.setBounds(100, 240, 500, 100);
        rightPanel.add(instructionsLabel);
        rightPanel.add(titleLabel);
        rightPanel.add(title);
        rightPanel.add(textLabel);
        rightPanel.add(textBox);
        rightPanel.add(saveButton);
        notes.setLayout(null);
        notes.getContentPane().add(leftPanel);
        notes.getContentPane().add(rightPanel);
        notes.setResizable(false);
        notes.setLocationRelativeTo(null);
        notes.setVisible(true);
    }
}
