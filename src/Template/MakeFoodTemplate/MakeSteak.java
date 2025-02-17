package Template.MakeFoodTemplate;

public class MakeSteak extends MakeFood {

    @Override
    public void prepare() {
        System.out.println("Preparing Steak...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Steak...");
    }
}
