package Template.MakeFoodTemplate;

public class MakeSalad extends MakeFood {
    @Override
    public void prepare() {
        System.out.println("Preparing Salad...");
    }

    @Override
    public void cook() {
        System.out.println("Nothing to cook");
    }

    @Override
    public void serve() {
        System.out.println("Serving Salad... It's different to other servings");
    }
}
