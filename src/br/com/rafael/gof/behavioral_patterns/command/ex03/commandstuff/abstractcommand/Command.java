package br.com.rafael.gof.behavioral_patterns.command.ex03.commandstuff.abstractcommand;

import br.com.rafael.gof.behavioral_patterns.command.ex03.editor.Editor;

public abstract class Command {
    private final Editor editor; //This is the receiver of each request.
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void backup() {
        this.backup = this.editor.getTextField().getText();
    }

    public void undo() {
        this.editor.getTextField().setText(this.backup);
    }

    /**
     * This method is called by a sender or invoker of this command.
     * If the execution of this command changes the text editor state
     * then it must return true. Otherwise, false.
     * @return true if the text editor got changed. False otherwise.
     */
    public abstract boolean execute();

    public Editor getEditor() {
        return this.editor;
    }
}
