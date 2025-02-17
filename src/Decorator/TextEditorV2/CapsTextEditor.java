package Decorator.TextEditorV2;

public class CapsTextEditor extends BasicTextEditor {
    public CapsTextEditor(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public String read() {
        return text.toUpperCase();
    }
}
