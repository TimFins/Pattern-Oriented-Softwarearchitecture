package Strategy.DuckStrategy;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck(new FastFly());
        duck.fly();

        Duck duck2 = new Duck(new SlowFly());
        duck2.fly();
    }
}
