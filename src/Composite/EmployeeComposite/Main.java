package Composite.EmployeeComposite;

public class Main {
    public static void main(String[] args) {
        Designer designer1 = new Designer("Tim", 30000);
        Designer designer2 = new Designer("Max", 30000);
        Manager designerManager = new Manager("Tom", 50000);
        designerManager.add(designer1);
        designerManager.add(designer2);

        Developer developer1 = new Developer("Timme", 40000);
        Developer developer2 = new Developer("Maxi", 40000);
        Manager developerManager = new Manager("Tom", 60000);
        developerManager.add(developer1);
        developerManager.add(developer2);

        Manager ceo = new Manager("CEO", 100000);
        ceo.add(designerManager);
        ceo.add(developerManager);



        System.out.printf(String.valueOf(ceo.calculateSalary()));
        System.out.print("\n");
        System.out.printf(String.valueOf(developer2.calculateSalary()));
    }
}
