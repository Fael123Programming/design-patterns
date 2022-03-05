package br.com.rafael.gof.behavioral_patterns.mediator.structure.concrete.concretecomponents;

import br.com.rafael.gof.behavioral_patterns.mediator.structure.abstract_.abstractcomponent.Component;
import br.com.rafael.gof.behavioral_patterns.mediator.structure.abstract_.abstractmediator.Mediator;

public class ConcreteComponentA extends Component {
    public ConcreteComponentA(Mediator m) {
        super(m);
    }

    @Override
    public void operation() {
        this.getMediator().intimate(this);
    }
}
