package Factory.VehicleFabric;

public class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle create(String name) {
        return new Motorcycle(name);
    }
}
