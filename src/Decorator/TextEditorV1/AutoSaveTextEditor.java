package Decorator.TextEditorV1;

public class AutoSaveTextEditor extends TextEditorExtension {
    public AutoSaveTextEditor(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void print() {
        textEditor.print();
        System.out.println("    auto-save-on");
    }
}
