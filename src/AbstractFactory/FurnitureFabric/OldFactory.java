package AbstractFactory.FurnitureFabric;

public class OldFactory implements FurnitureFactory {

    @Override
    public Furniture createChair(float price) {
        return new OldChair(price);
    }

    @Override
    public Furniture createSofa(float price) {
        return new OldSofa(price);
    }

    @Override
    public Furniture createTable(float price) {
        return new OldTable(price);
    }
}
