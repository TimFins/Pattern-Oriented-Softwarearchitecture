package AbstractFactory.FurnitureFabric;

public class OldChair extends Chair {
    public OldChair(float price) {
        super(price);
    }

    @Override
    public String getType() {
        return "Old Chair";
    }
}
