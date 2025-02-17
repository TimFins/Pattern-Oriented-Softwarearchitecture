package AbstractFactory.FurnitureFabric;

public class ModernChair extends Chair {
    public ModernChair(float price) {
        super(price);
    }

    @Override
    public String getType() {
        return "Modern Chair";
    }
}
