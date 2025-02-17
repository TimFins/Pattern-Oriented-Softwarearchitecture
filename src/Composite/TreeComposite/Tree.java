package Composite.TreeComposite;

public class Tree extends Node {
    public Node left;
    public Node right;

    public Tree(Node left, Node right, int value) {
        super(value);
        this.left = left;
        this.right = right;
    }

    public int calc() {
        return left.calc() + right.calc() + value;
    }
}
