package Decorator.TextEditorV2;

public abstract class TextEditor {
    public String text;

    public void write(String text) {
        this.text = text;
    }

    public String read() {
        return text;
    }

    public void save() {
        System.out.println("I am somehow persistently saving the text.");
    }
}
