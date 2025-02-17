package Decorator.TextEditorV2;

public class BasicTextEditor extends TextEditor {
    public TextEditor basicTextEditor;

    public BasicTextEditor() {}

    public BasicTextEditor(TextEditor textEditor) {
        this.basicTextEditor = textEditor;
    }
}
