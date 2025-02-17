package AbstractFactory.FurnitureFabric;

public class OldTable extends Table {
    public OldTable(float price) {
        super(price);
    }

    @Override
    public String getType() {
        return "Old Table";
    }
}
