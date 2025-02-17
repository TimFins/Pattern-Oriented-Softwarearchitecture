package AbstractFactory.FurnitureFabric;

public interface FurnitureFactory {
    public Furniture createChair(float price);
    public Furniture createSofa(float price);
    public Furniture createTable(float price);
}
