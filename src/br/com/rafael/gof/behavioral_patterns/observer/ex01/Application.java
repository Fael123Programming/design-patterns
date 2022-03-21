package br.com.rafael.gof.behavioral_patterns.observer.ex01;

import br.com.rafael.gof.behavioral_patterns.observer.ex01.subscriber.EmailAlertsListener;
import br.com.rafael.gof.behavioral_patterns.observer.ex01.subscriber.LoggingListener;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();
        LoggingListener loggingListener = null;
        EmailAlertsListener emailListener = new EmailAlertsListener("john@example.com", "Someone has" +
                " changed the file");
        try {
            loggingListener = new LoggingListener("log.txt", "Someone has opened the file");
        } catch(IOException ignore) {
            System.out.println("An IOException has been thrown...");
        }
        editor.eventManager.subscribe("open", loggingListener);
        try {
            editor.openFile("my_file.txt");
        } catch(IOException e) {
            System.out.println("An IO exception has been thrown when trying to open the file");
        }
        try {
            editor.saveFile();
        } catch(IOException e) {
            System.out.println("An IO exception has been thrown when trying to save the file...");
        }
    }
}
