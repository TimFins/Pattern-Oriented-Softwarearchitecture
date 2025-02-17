package Factory.VehicleFabric;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle create(String name) {
        return new Car(name);
    }
}
