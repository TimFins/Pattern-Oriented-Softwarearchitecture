package Template.AbstractTemplate;

public class SecondConcreteTemplate extends Template {
    @Override
    public void step1() {
        System.out.println("SecondConcreteTemplate.step1");
    }

    @Override
    public void step2() {
        System.out.println("SecondConcreteTemplate.step2");
    }

    @Override
    public void step3() {
        System.out.println("SecondConcreteTemplate.step3");
    }
}
