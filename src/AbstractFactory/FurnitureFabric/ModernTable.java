package AbstractFactory.FurnitureFabric;

public class ModernTable extends Table {
    public ModernTable(float price) {
        super(price);
    }

    @Override
    public String getType() {
        return "Modern Table";
    }
}
