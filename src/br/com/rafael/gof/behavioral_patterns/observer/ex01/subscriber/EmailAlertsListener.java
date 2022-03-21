package br.com.rafael.gof.behavioral_patterns.observer.ex01.subscriber;

public class EmailAlertsListener implements EventListener { //Concrete subscriber!
    private final String email, message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String filename) {
        sendEmail(email, message + ": " + filename);
    }

    private static void sendEmail(String email, String message) {
        System.out.println("Email sent to " + email);
    }
}
