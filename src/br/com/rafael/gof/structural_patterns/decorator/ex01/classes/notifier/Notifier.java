package br.com.rafael.gof.structural_patterns.decorator.ex01.classes.notifier;

import java.util.ArrayList;

public class Notifier {
    private final ArrayList<String> emailsToSendMsg;

    {
        emailsToSendMsg = new ArrayList<>();
    }

    public Notifier(String email) {
        this.emailsToSendMsg.add(email);
    }

    public Notifier() {}

    public void addEmail(String email) {
        this.emailsToSendMsg.add(email);
    }

    public void removeEmail(int index) {
        if (index < 0 || index >= this.emailsToSendMsg.size())
            throw new IllegalArgumentException("index " + index + " is invalid");
        this.emailsToSendMsg.remove(index);
    }

    public void send(String msg) {
        if (this.emailsToSendMsg.isEmpty())
            throw new RuntimeException("no destiny to send a message");
        for (String email : this.emailsToSendMsg) {
            System.out.println("---------------------------------");
            System.out.println("Sending message to email");
            System.out.println("Content: " + msg);
            System.out.println("To: " + email);
        }
    }
}
