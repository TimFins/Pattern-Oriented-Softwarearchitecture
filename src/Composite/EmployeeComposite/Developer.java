package Composite.EmployeeComposite;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
