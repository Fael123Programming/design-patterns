package br.com.rafael.gof.behavioral_patterns.command.ex03.commandstuff.concretecommands;

import br.com.rafael.gof.behavioral_patterns.command.ex03.commandstuff.abstractcommand.Command;
import br.com.rafael.gof.behavioral_patterns.command.ex03.editor.Editor;

import javax.swing.*;

public class CutCommand extends Command {
    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        Editor editor = super.getEditor();
        JTextArea textArea = editor.getTextField();
        if (textArea.getSelectedText() == null|| textArea.getSelectedText().isEmpty())
            return false; //Nothing has been selected...
        super.backup(); //Save the latter state of the editor...
        String sourceStr = textArea.getText();
        editor.setClipboard(textArea.getSelectedText());
        textArea.setText(this.cutString(sourceStr));
        return true;
    }

    /**
     * Cuts the string passed as argument based on a piece of it
     * that had been selected on a text area.
     * @param sourceStr the string to be cut
     * @return the result of the cut
     */
    private String cutString(String sourceStr) {
        JTextArea textArea = super.getEditor().getTextField();
        return sourceStr.substring(0, textArea.getSelectionStart()) + sourceStr.substring(textArea.getSelectionEnd());
    }
}
