package Factory.FurnitureFabric;

public class Table extends Furniture {
    public Table(float price) {
        super(price);
    }

    public String getType() {
        return "Table";
    }
}
