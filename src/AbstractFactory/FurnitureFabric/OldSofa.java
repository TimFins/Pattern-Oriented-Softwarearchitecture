package AbstractFactory.FurnitureFabric;

public class OldSofa extends Sofa {
    public OldSofa(float price) {
        super(price);
    }

    @Override
    public String getType() {
        return "Old Sofa";
    }
}
