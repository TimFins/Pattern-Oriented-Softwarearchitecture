package Command.TextEditorCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandHandler {
    private final List<EditorCommand> commands;

    public CommandHandler() {
        commands = new ArrayList<>();
    }

    public void addCommand(EditorCommand command) {
        commands.add(command);
    }

    public void undoLastCommand() {
        EditorCommand command = commands.removeLast();

        command.undoCommand();
    }
}
