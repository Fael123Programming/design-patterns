package br.com.rafael.gof.behavioral_patterns.command.ex03.commandstuff.concretecommands;

import br.com.rafael.gof.behavioral_patterns.command.ex03.commandstuff.abstractcommand.Command;
import br.com.rafael.gof.behavioral_patterns.command.ex03.editor.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        Editor editor = super.getEditor();
        editor.setClipboard(editor.getTextField().getSelectedText());
        return false;
    }
}
