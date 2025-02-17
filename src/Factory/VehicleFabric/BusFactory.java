package Factory.VehicleFabric;

public class BusFactory implements VehicleFactory {
    @Override
    public Vehicle create(String name) {
        return new Bus(name);
    }
}
