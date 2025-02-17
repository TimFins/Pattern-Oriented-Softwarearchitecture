package Command.SmartHomeCommand;

public class Heating extends SmartHomeDevice{
    double heat;

    public Heating(String name) {
        super(name);
        this.heat = 22.5;
    }

    public void setHeat(double heat) {
        this.heat = heat;

        this.printInfo();
    }

    @Override
    public void printInfo() {
        System.out.println(this.name + " heating is set to " + this.heat + " degree celsisus.");
    }
}
