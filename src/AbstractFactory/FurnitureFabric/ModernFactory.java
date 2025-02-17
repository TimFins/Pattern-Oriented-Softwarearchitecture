package AbstractFactory.FurnitureFabric;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Furniture createChair(float price) {
        return new ModernChair(price);
    }

    @Override
    public Furniture createSofa(float price) {
        return new ModernSofa(price);
    }

    @Override
    public Furniture createTable(float price) {
        return new ModernTable(price);
    }
}
