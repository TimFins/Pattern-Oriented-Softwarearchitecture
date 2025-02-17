package Decorator.TextEditorV1;

public abstract class TextEditorExtension implements TextEditor {
    public TextEditor textEditor;

    public TextEditorExtension(TextEditor textEditor) {
        this.textEditor = textEditor;
    }
}