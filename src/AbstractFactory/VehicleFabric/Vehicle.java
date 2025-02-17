package AbstractFactory.VehicleFabric;

public abstract class Vehicle {
    public String name;
    public int tireAmount;

    public Vehicle(String name, int tireAmount) {
        this.name = name;
        this.tireAmount = tireAmount;
    }

    public void printInfo() {
        System.out.println(this.name + " has " + this.tireAmount + " tires.");
    }
}
