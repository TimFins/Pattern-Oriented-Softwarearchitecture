package Command.SmartHomeCommand;

public abstract class SmartHomeDevice {
    public String name;

    public SmartHomeDevice(String name) {
        this.name = name;
    }

    public abstract void printInfo();
}
