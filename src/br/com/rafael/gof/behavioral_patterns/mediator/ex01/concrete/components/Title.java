package br.com.rafael.gof.behavioral_patterns.mediator.ex01.concrete.components;

import br.com.rafael.gof.behavioral_patterns.mediator.ex01.abstract_.Component;
import br.com.rafael.gof.behavioral_patterns.mediator.ex01.abstract_.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Title extends JTextField implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public int getType() {
        return Component.TITLE;
    }

    @Override
    public void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }
}
