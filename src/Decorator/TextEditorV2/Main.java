package Decorator.TextEditorV2;

public class Main {
    public static void main(String[] args) {
        TextEditor b = new BasicTextEditor();

        b.write("Hi");
        System.out.println(b.read());
        b = new AutoSaveTextEditor(b);
        b.write("Hi");
        b = new CapsTextEditor(b);
        b.write("Hi");
        System.out.println(b.read());
    }
}
