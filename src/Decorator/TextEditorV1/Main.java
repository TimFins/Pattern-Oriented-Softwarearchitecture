package Decorator.TextEditorV1;

public class Main {
    public static void main(String[] args) {
        TextEditor e = new AutoSaveTextEditor(new PopOutTextEditor(new BaseTextEditor("Hi, I am an editor!")));
        e.print();
    }
}
