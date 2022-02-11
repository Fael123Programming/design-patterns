package br.com.rafael.gof.structural_patterns.decorator.ex01.main;

import br.com.rafael.gof.structural_patterns.decorator.ex01.app.App;
import br.com.rafael.gof.structural_patterns.decorator.ex01.classes.decorators.FacebookDecorator;
import br.com.rafael.gof.structural_patterns.decorator.ex01.classes.decorators.SMSDecorator;
import br.com.rafael.gof.structural_patterns.decorator.ex01.classes.decorators.SlackDecorator;
import br.com.rafael.gof.structural_patterns.decorator.ex01.classes.notifier.Notifier;

public class Main {
    public static void main(String[] args) {
        boolean sendToFacebook = true, sendToSlack = true, sendToSMS = true;
        App app = new App();
        Notifier notifier = new Notifier("rafaelfonseca1020@gmail.com");
        if (sendToFacebook)
            notifier = new FacebookDecorator(notifier, "rafael123");
        if (sendToSlack)
            notifier = new SlackDecorator(notifier, "guimaraes_rafael");
        if (sendToSMS)
            notifier = new SMSDecorator(notifier, "5564991345614");
//      We are adding functionalities as a stack: one on top of other!!!
//      Send message via email, Facebook and Slack.
        app.setNotifier(notifier);
        app.sendMessageWithNotifier("Hey rafaaaa...");
    }
}
