package Factory.VehicleFabric;

public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory busFactory = new BusFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();

        Vehicle car =  carFactory.create("Audi A4");
        car.printInfo();
        car =  carFactory.create("Audi A5");
        car.printInfo();
    }
}
