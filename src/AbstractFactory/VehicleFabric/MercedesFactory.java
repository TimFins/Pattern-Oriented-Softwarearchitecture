package AbstractFactory.VehicleFabric;

public class MercedesFactory implements AbstractFactory {

    @Override
    public Vehicle createCar(String name) {
        return new MercedesCar(name);
    }

    @Override
    public Vehicle createBus(String name) {
        return new MercedesBus(name);
    }
}
