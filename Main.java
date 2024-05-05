import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan Kowalski", 4500, 1, "04.20.2020", "Senior Developer");
        Worker worker2 = new Worker("Jan Niekowalski", 4400, 2, "01.01.2014", "Junior Developer");
        Worker worker3 = new Worker("Jan Nowak", 4300, 3, "09.11.2001", "QA Engineer");
        Worker worker4 = new Worker("Jan Nienowak", 4200, 4, "06.09.2010", "Project Manager");

        Manager manager = new Manager("Janusz Kowalski", 6000, 5, "04.05.2024", "Head of Department");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                    ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
            employee.work();
        }
    }
}
