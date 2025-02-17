package Command.TextEditorCommand;

public class DeleteCommand extends EditorCommand {
    public DeleteCommand(String newText, Editor editor) {
        super(newText, editor);
    }

    @Override
    public void doCommand() {
        editor.text = newText;
    }

    @Override
    public void undoCommand() {
        editor.text = oldText;
    }
}
