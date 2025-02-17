package Command.TextEditorCommand;

public abstract class EditorCommand {
    public String newText;
    public String oldText;
    public Editor editor;

    public EditorCommand(String newText, Editor editor) {
        this.newText = newText;
        this.oldText = editor.text;
        this.editor = editor;
    }

    public abstract void doCommand();
    public abstract void undoCommand();
}
