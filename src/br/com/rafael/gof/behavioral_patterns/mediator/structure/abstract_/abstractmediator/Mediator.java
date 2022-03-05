package br.com.rafael.gof.behavioral_patterns.mediator.structure.abstract_.abstractmediator;

import br.com.rafael.gof.behavioral_patterns.mediator.structure.abstract_.abstractcomponent.Component;

public interface Mediator {
    void intimate(Component notificationSender);
}
