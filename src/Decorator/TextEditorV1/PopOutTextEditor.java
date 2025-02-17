package Decorator.TextEditorV1;

public class PopOutTextEditor extends TextEditorExtension {
    public PopOutTextEditor(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void print() {
        textEditor.print();
        System.out.println("    pop-out-on");
    }
}
