package Command.SmartHomeCommand;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void doCommand() {
        light.turnOn();
    }

    @Override
    public void undoCommand() {
        light.turnOff();
    }
}
