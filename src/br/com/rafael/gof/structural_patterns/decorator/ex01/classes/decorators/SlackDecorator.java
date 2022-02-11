package br.com.rafael.gof.structural_patterns.decorator.ex01.classes.decorators;

import br.com.rafael.gof.structural_patterns.decorator.ex01.classes.notifier.Notifier;

public class SlackDecorator extends BaseDecorator {
    private String slackUsername;

    public SlackDecorator(Notifier notifier, String slackUsername) {
        super(notifier);
        this.slackUsername = slackUsername;
    }

    public String getSlackUsername() {
        return this.slackUsername;
    }

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }

    public void send(String msg) {
        super.send(msg);
        System.out.println("---------------------------------");
        System.out.println("Sending message to a slack user");
        System.out.println("Content: " + msg);
        System.out.println("To: " + this.slackUsername + " from Slack");
    }
}
