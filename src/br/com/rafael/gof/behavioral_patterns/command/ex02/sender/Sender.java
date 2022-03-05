package br.com.rafael.gof.behavioral_patterns.command.ex02.sender;

import br.com.rafael.gof.behavioral_patterns.command.ex02.commandinterface.Command;

public class Sender { //Sender or invoker of the command.
    private Command command;

    public Command getCommand() {
        return this.command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        this.command.execute();
    }
}
