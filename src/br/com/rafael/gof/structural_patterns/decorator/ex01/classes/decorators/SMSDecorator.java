package br.com.rafael.gof.structural_patterns.decorator.ex01.classes.decorators;

import br.com.rafael.gof.structural_patterns.decorator.ex01.classes.notifier.Notifier;

public class SMSDecorator extends BaseDecorator {
    private String fullPhoneNumber;

    public SMSDecorator(Notifier notifier, String fullPhoneNumber) {
        super(notifier);
        this.fullPhoneNumber = fullPhoneNumber;
    }

    public String getFullPhoneNumber() {
        return this.fullPhoneNumber;
    }

    public void setFullPhoneNumber(String fullPhoneNumber) {
        this.fullPhoneNumber = fullPhoneNumber;
    }

    public void send(String msg) {
        super.send(msg);
        System.out.println("---------------------------------");
        System.out.println("Sending SMS to a phone number");
        System.out.println("Content: " + msg);
        System.out.println("To: " + this.fullPhoneNumber);
    }
}
