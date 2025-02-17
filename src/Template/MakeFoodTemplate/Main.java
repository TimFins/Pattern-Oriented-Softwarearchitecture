package Template.MakeFoodTemplate;

public class Main {
    public static void main(String[] args) {
        MakeFood makeFood = new MakeSalad();
        makeFood.makeFood();

        MakeFood makeFood2 = new MakeSteak();
        makeFood2.makeFood();
    }
}
