package Command.TextEditorCommand;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor(new CommandHandler());
        // This exmaple in general is just okay, because the different commands
        // don't really do anything different. But the undo command is shown very
        // good here.

        editor.write("Hi!");
        editor.read();
        editor.write(editor.text + " Some new Text!");
        editor.read();
        editor.delete("Hiiii!");
        editor.read();
        editor.undoLastCommand();
        editor.read();
        editor.undoLastCommand();
        editor.read();
        editor.undoLastCommand();
        editor.read();
    }
}
