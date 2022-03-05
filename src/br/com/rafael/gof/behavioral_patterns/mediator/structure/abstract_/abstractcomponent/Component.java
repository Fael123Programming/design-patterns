package br.com.rafael.gof.behavioral_patterns.mediator.structure.abstract_.abstractcomponent;

import br.com.rafael.gof.behavioral_patterns.mediator.structure.abstract_.abstractmediator.Mediator;

public abstract class Component {
    private Mediator mediator;

    public Component(Mediator m) {
        this.mediator = m;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public void setMediator(Mediator m) {
        this.mediator = m;
    }

    public abstract void operation();
}
