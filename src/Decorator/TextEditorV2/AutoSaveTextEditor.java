package Decorator.TextEditorV2;

public class AutoSaveTextEditor extends BasicTextEditor{
    public AutoSaveTextEditor(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void write(String text) {
        super.write(text);
        save();
    }
}
