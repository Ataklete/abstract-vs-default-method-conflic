interface Director {
    default void generateReport() {
        System.out.println("Generating report from Director interface.");
    };
}

interface Manager {
    default void generateReport() {
        System.out.println("Generating report from Manager interface.");
    };
}
public class Employee implements Director, Manager {

//    @Override
    public void generateReport() {
        Director.super.generateReport();
        Manager.super.generateReport();
        System.out.println("Generating report from Employee class.");
    }
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.generateReport();
        Director director = new Employee();
        director.generateReport();
        Manager manager = new Employee();
        manager.generateReport();
    }
}
