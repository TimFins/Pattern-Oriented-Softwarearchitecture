package Factory.FurnitureFabric;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new ChairFactory());

        System.out.println(client.factory.createFurniture(10).getType());

        Client client2 = new Client(new TableFactory());

        System.out.println(client2.factory.createFurniture(10).getType());
    }
}
