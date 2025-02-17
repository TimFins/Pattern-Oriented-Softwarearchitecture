package Factory.FurnitureFabric;

public class TableFactory implements FurnitureFactory {
    public Furniture createFurniture(float price) {
        return new Table(price);
    }
}
