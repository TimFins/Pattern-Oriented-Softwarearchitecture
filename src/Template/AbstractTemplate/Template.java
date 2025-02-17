package Template.AbstractTemplate;

public abstract class Template {
    public final void run() {
        step1();
        step2();
        step3();
        step4();
    }

    public void step1() {
        System.out.println("Step 1");
    }

    public abstract void step2();

    public abstract void step3();

    public final void step4() {
        System.out.println("Step 4");
    }
}
