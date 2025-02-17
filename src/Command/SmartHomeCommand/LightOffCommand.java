package Command.SmartHomeCommand;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void doCommand() {
        light.turnOff();
    }

    @Override
    public void undoCommand() {
        light.turnOn();
    }
}
