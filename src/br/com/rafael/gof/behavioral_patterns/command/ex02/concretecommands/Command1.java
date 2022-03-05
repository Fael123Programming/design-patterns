package br.com.rafael.gof.behavioral_patterns.command.ex02.concretecommands;

import br.com.rafael.gof.behavioral_patterns.command.ex02.commandinterface.Command;
import br.com.rafael.gof.behavioral_patterns.command.ex02.receiver.Receiver;

public class Command1 implements Command { //Concrete command
    private final Receiver receiver;
//  Its further attributes...

    public Command1(Receiver receiver/*, attribute1, attribute2,..., attributeN*/) {
        this.receiver = receiver;
    }

    public Receiver getReceiver() {
        return this.receiver;
    }

    @Override
    public void execute() {
        System.out.println("Command1 object is executing...");
    }
}
