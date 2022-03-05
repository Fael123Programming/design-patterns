package br.com.rafael.gof.behavioral_patterns.command.ex02.concretecommands;

import br.com.rafael.gof.behavioral_patterns.command.ex02.commandinterface.Command;
import br.com.rafael.gof.behavioral_patterns.command.ex02.receiver.Receiver;

public class Command2 implements Command {
    private final Receiver receiver;
//  Its further attributes...

    public Command2(Receiver receiver) {
        this.receiver = receiver;
    }

    public Receiver getReceiver() {
        return this.receiver;
    }

    @Override
    public void execute() {
        System.out.println("Command2 is executing...");
    }
}
