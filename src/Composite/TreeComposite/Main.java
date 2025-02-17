package Composite.TreeComposite;

public class Main {
    public static void main(String[] args) {
        Node node = new Tree(
                new Tree(
                        new Leaf(1),
                        new Leaf(2),
                        3
                ),
                new Tree(
                        new Leaf(4),
                        new Leaf(5),
                        6
                ),
                7
        );

        System.out.println(node.calc());
    }
}
