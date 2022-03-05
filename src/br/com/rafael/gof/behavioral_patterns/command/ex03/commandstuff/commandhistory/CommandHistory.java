package br.com.rafael.gof.behavioral_patterns.command.ex03.commandstuff.commandhistory;

import br.com.rafael.gof.behavioral_patterns.command.ex03.commandstuff.abstractcommand.Command;
import java.util.Stack;

public class CommandHistory {
    private final Stack<Command> commands;

    {
        this.commands = new Stack<>();
    }

    public void push(Command command) {
        this.commands.push(command);
    }

    public Command pop() {
        if (this.commands.isEmpty())
            return null;
        return this.commands.pop();
    }

    public boolean isEmpty() {
        return this.commands.isEmpty();
    }
}
