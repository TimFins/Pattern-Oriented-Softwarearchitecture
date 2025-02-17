package AbstractFactory.VehicleFabric;

public class Main {
    public static void main(String[] args) {
        AbstractFactory mercedesFactory = new MercedesFactory();
        Vehicle vehicle =  mercedesFactory.createBus("T1");
        vehicle.printInfo();

        Vehicle vehicle2 =  mercedesFactory.createCar("CLA");
        vehicle2.printInfo();

        AbstractFactory audiFactory = new AudiFactory();
        Vehicle vehicle3 = audiFactory.createBus("HN8");
        vehicle3.printInfo();

        Vehicle vehicle4 = audiFactory.createCar("A4");
        vehicle4.printInfo();
    }
}
