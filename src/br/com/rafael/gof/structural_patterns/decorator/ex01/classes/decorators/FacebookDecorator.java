package br.com.rafael.gof.structural_patterns.decorator.ex01.classes.decorators;

import br.com.rafael.gof.structural_patterns.decorator.ex01.classes.notifier.Notifier;

public class FacebookDecorator extends BaseDecorator {
    private String facebookUsername;

    public FacebookDecorator(Notifier notifier, String facebookUsername) {
        super(notifier);
        this.facebookUsername = facebookUsername;
    }

    public String getFacebookUsername() {
        return this.facebookUsername;
    }

    public void setFacebookUsername(String facebookUsername) {
        this.facebookUsername = facebookUsername;
    }

    public void send(String msg) {
        super.send(msg);
        System.out.println("---------------------------------");
        System.out.println("Sending message to a facebook user");
        System.out.println("Content: " + msg);
        System.out.println("To: " + this.facebookUsername + " from Facebook");
    }
}
