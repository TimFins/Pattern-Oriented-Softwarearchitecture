package AbstractFactory.FurnitureFabric;

public class ModernSofa extends Sofa {
    public ModernSofa(float price) {
        super(price);
    }

    @Override
    public String getType() {
        return "Modern Sofa";
    }
}
