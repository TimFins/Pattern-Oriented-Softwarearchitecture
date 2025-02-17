package AbstractFactory.VehicleFabric;

public interface AbstractFactory {
    Vehicle createCar(String name);
    Vehicle createBus(String name);
}
