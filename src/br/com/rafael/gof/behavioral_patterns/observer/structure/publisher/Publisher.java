package br.com.rafael.gof.behavioral_patterns.observer.structure.publisher;

import br.com.rafael.gof.behavioral_patterns.observer.structure.abstractsubscriber.Subscriber;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public class Publisher {
    private List<Subscriber> subscribers;
    private String mainState;

    public Publisher(String mainState) {
        this.mainState = mainState;
    }

    public String getMainState() {
        return mainState;
    }

    public void setMainState(String mainState) {
        this.mainState = mainState;
        notifySubscribers();
    }

    public void subscribe(Subscriber s) {
        Objects.requireNonNull(s, "subscriber cannot be null");
        if (subscribers == null)
            subscribers = new ArrayList<>();
        subscribers.add(s);
        s.update(mainState);
    }

    public void unsubscribe(Subscriber s) {
        Objects.requireNonNull(s, "subscriber cannot be null");
        if (subscribers.isEmpty())
            return;
        if (!subscribers.remove(s))
            throw new SubscriberNotFoundException();
    }

    public void notifySubscribers() {
        for (Subscriber s : subscribers)
            s.update(mainState);
    }

    @Override
    public String toString() {
        return "A publisher with state: " + mainState;
    }

    public static class SubscriberNotFoundException extends RuntimeException {
        public SubscriberNotFoundException() {
            super("subscriber not found");
        }
    }
}
