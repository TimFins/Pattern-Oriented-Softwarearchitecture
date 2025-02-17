package AbstractFactory.VehicleFabric;

public class AudiFactory implements AbstractFactory {

    @Override
    public Vehicle createCar(String name) {
        return new AudiCar(name);
    }

    @Override
    public Vehicle createBus(String name) {
        return new AudiBus(name);
    }
}
