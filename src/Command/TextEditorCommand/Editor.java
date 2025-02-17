package Command.TextEditorCommand;

public class Editor {
    public String text;
    public CommandHandler commandHandler;

    public Editor(CommandHandler commandHandler) {
        this.text = "";
        this.commandHandler = commandHandler;
    }

    public void write(String newText) {
        EditorCommand command = new WriteCommand(newText, this);
        command.doCommand();
        commandHandler.addCommand(command);
    }

    public void delete(String newText) {
        EditorCommand command = new DeleteCommand(newText, this);
        command.doCommand();
        commandHandler.addCommand(command);
    }

    public void read() {
        System.out.println(text);
    }

    public void undoLastCommand() {
        commandHandler.undoLastCommand();
    }
}
