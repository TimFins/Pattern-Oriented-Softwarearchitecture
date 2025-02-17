package Factory.FurnitureFabric;

public class ChairFactory implements FurnitureFactory {
    public Furniture createFurniture(float price) {
        return new Chair(price);
    }
}
