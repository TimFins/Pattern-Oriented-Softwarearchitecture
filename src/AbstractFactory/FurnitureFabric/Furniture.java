package AbstractFactory.FurnitureFabric;

public abstract class Furniture {
    private float price;

    public Furniture(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract String getType();
}
