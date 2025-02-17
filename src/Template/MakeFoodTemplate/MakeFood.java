package Template.MakeFoodTemplate;

public abstract class MakeFood {
    public final void makeFood() {
        prepare();
        cook();
        serve();
    }

    public abstract void prepare();
    public abstract void cook();
    public void serve() {
        System.out.println("Putting the plate on the table.");
    }
}
