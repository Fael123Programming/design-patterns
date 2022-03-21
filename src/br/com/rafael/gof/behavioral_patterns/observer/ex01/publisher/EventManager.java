package br.com.rafael.gof.behavioral_patterns.observer.ex01.publisher;

import br.com.rafael.gof.behavioral_patterns.observer.ex01.subscriber.EventListener;

import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class EventManager { //Publisher!
    private final Map<String, EventListener> listeners;

    {
        listeners = new HashMap<>();
    }

    public void subscribe(String eventType, EventListener listener) {
        listeners.put(eventType, listener);
    }

    public void unsubscribe(String eventType, EventListener listener) throws ListenerNotFound {
        if (listeners.isEmpty())
            return;
        if (!listeners.remove(eventType, listener))
            throw new ListenerNotFound();
    }

    public void notify(String eventType, String filename) throws IOException {
        for (String key : listeners.keySet())
            if (key.equals(eventType))
                listeners.get(key).update(filename);
    }

    public static class ListenerNotFound extends RuntimeException {
        public ListenerNotFound() {
            super("listener not found");
        }
    }
}
