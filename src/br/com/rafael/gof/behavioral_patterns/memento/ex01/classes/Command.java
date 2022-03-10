package br.com.rafael.gof.behavioral_patterns.memento.ex01.classes;

public class Command {
    private EditorSnapshot backupObject;

    public Command(Editor editor) {
        checkNull(editor);
        backupObject = editor.save();
    }

    public void setBackupObject(Editor editor) {
        checkNull(editor);
        backupObject = editor.save();
    }

    public void undo() {
        backupObject.restore();
    }

    private void checkNull(Object object) {
        if (object == null)
            throw new IllegalArgumentException("Cannot receive null as argument");
    }
}
