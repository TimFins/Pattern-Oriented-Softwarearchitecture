package Composite.TreeComposite;

public class Leaf extends Node {
    public Leaf(int value) {
        super(value);
    }

    @Override
    public int calc() {
        return value;
    }
}
