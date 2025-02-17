package Strategy.DuckStrategy;

public class Duck {
    public FlyBehavior flyBehavior;

    public Duck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void fly() {
        this.flyBehavior.fly();
    }
}
