package Command.SmartHomeCommand;

public class Light extends SmartHomeDevice{
    public boolean on = false;

    public Light(String name) {
        super(name);
    }

    public void turnOn() {
        this.on = true;

        this.printInfo();
    }

    public void turnOff() {
        this.on = false;

        this.printInfo();
    }

    @Override
    public void printInfo() {
        System.out.println(this.name + " light is now " + (this.on ? "on." : "off."));
    }
}
