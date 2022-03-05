package br.com.rafael.gof.behavioral_patterns.command.ex03.editor;

import br.com.rafael.gof.behavioral_patterns.command.ex03.commandstuff.abstractcommand.Command;
import br.com.rafael.gof.behavioral_patterns.command.ex03.commandstuff.commandhistory.CommandHistory;
import br.com.rafael.gof.behavioral_patterns.command.ex03.commandstuff.concretecommands.*;
import javax.swing.*;
import java.awt.*;

public class Editor {
    private final JTextArea textField;
    private final CommandHistory commandHistory;
    private String clipboard;

    {
        this.textField = new JTextArea();
        this.commandHistory = new CommandHistory();
    }

    public void init() {
        this.textField.setLineWrap(true);
        JFrame frame = new JFrame("Text Editor (type something and use the buttons below)");
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.add(this.textField);
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");
        Editor editor = this;
        ctrlC.addActionListener(e -> executeCommand(new CopyCommand(editor)));
        ctrlX.addActionListener(e -> executeCommand(new CutCommand(editor)));
        ctrlV.addActionListener(e -> executeCommand(new PasteCommand(editor)));
        ctrlZ.addActionListener(e -> undo());
        buttonsPanel.add(ctrlC);
        buttonsPanel.add(ctrlX);
        buttonsPanel.add(ctrlV);
        buttonsPanel.add(ctrlZ);
        content.add(buttonsPanel);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCommand(Command command) {
        if (command.execute()) //If command execution changed editor, then save it.
            this.commandHistory.push(command);
    }

    private void undo() {
        Command lastCommand = this.commandHistory.pop();
        if (lastCommand == null) //Empty stack.
            return;
        lastCommand.undo();
    }

    public JTextArea getTextField() {
        return this.textField;
    }

    public String getClipboard() {
        return this.clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }
}
