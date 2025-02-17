package Composite.EmployeeComposite;

public class Designer extends Employee {
    public Designer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
