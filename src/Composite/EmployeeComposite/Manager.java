package Composite.EmployeeComposite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    List<Employee> employees;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
        employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public double calculateSalary() {
        double salary = this.salary;
        for (Employee employee : employees) {
            salary += employee.calculateSalary();
        }

        return salary;
    }
}
