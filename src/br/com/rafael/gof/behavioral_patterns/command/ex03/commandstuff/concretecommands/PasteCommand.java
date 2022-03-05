package br.com.rafael.gof.behavioral_patterns.command.ex03.commandstuff.concretecommands;

import br.com.rafael.gof.behavioral_patterns.command.ex03.commandstuff.abstractcommand.Command;
import br.com.rafael.gof.behavioral_patterns.command.ex03.editor.Editor;
import javax.swing.*;

public class PasteCommand extends Command {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        Editor editor = super.getEditor();
        String clipboard = editor.getClipboard();
        if (clipboard == null || clipboard.isEmpty())
            return false;
        super.backup();
        JTextArea textArea = editor.getTextField();
        textArea.insert(clipboard, textArea.getCaretPosition());
        return true;
    }
}
