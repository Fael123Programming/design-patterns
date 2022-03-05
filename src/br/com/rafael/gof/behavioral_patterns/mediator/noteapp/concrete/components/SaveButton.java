package br.com.rafael.gof.behavioral_patterns.mediator.noteapp.concrete.components;

import br.com.rafael.gof.behavioral_patterns.mediator.noteapp.abstract_.Component;
import br.com.rafael.gof.behavioral_patterns.mediator.noteapp.abstract_.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SaveButton extends JButton implements Component {
    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public int getType() {
        return Component.SAVE_BUTTON;
    }
}
