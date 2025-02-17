package Composite.TreeComposite;

public abstract class Node {
    public int value;

    public Node(int value) {
        this.value = value;
    }

    public abstract int calc();
}
