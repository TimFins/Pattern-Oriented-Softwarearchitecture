package Command.TextEditorCommand;

public class WriteCommand extends EditorCommand {
    public WriteCommand(String newText, Editor editor) {
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
