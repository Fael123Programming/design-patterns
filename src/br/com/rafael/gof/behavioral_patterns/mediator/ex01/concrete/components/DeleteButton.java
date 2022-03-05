package br.com.rafael.gof.behavioral_patterns.mediator.ex01.concrete.components;

import br.com.rafael.gof.behavioral_patterns.mediator.ex01.abstract_.Component;
import br.com.rafael.gof.behavioral_patterns.mediator.ex01.abstract_.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DeleteButton extends JButton implements Component {
    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public int getType() {
        return Component.DELETE_BUTTON;
    }
}
