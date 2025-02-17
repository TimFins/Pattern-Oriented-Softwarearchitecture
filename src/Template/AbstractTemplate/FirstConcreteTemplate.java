package Template.AbstractTemplate;

public class FirstConcreteTemplate extends Template{

    @Override
    public void step2() {
        System.out.println("FirstConcreteTemplate.step2");
    }

    @Override
    public void step3() {
        System.out.println("FirstConcreteTemplate.step3");
    }
}
