package ChainOfResponsibility.EmployeeCOR;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("shipping", new Employee("delivery", new Employee("payment", null)));
        e1.handle(new Mail("shipping", "Anything"));
    }
}
