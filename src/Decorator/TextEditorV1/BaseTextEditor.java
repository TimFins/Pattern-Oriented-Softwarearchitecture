package Decorator.TextEditorV1;

public class BaseTextEditor implements TextEditor {
    public String text;

    public BaseTextEditor(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Text: " + text);
    }
}
