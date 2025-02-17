package Command.SmartHomeCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandComposition implements Command {
    public List<Command> commands;

    public CommandComposition() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    @Override
    public void doCommand() {
        for (Command command : commands) {
            command.doCommand();
        }
    }

    @Override
    public void undoCommand() {
        for (Command command : commands) {
            command.undoCommand();
        }
    }
}
