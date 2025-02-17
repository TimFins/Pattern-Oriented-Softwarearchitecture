package Factory.FurnitureFabric;

public class Chair extends Furniture {
    public Chair(float price) {
        super(price);
    }

    public String getType() {
        return "Chair";
    }
}
