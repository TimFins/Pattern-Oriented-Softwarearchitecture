package AbstractFactory.FurnitureFabric;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new OldFactory());

        Furniture chair = client.factory.createChair(10);
        Furniture table = client.factory.createTable(10);
        Furniture sofa = client.factory.createSofa(10);

        System.out.println(chair.getType());
        System.out.println(table.getType());
        System.out.println(sofa.getType());
    }
}
