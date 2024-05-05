import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan Kowalski", 4500, 1, "04.20.2020", "Senior Developer");
        Worker worker2 = new Worker("Jan Niekowalski", 4400, 2, "01.01.2014", "Junior Developer");
        Worker worker3 = new Worker("Jan Nowak", 4300, 1, "09.11.2001", "QA Engineer");

        Manager manager = new Manager("Janusz Kowalski", 6000, 5, "04.05.2024", "Head of Department");

        Worker worker4 = new Worker("Janusz Niekowalski", 5000, 1, "02.15.2018", "System Analyst");
        Worker worker5 = new Worker("Janusz Nowak", 4700, 4, "07.07.2015", "Database Administrator");
        Manager manager2 = new Manager("Janusz Nienowak", 6500, 3, "12.10.2020", "Project Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager2);

        double totalSalaryAllEmployees = 0;
        double totalSalaryAllManagers = 0;
        double totalSalaryAllWorkers = 0;

        for (Employee employee : employees) {
            totalSalaryAllEmployees += employee.getSalary();
            if (employee instanceof Manager) {
                totalSalaryAllManagers += employee.getSalary();
            } else {
                totalSalaryAllWorkers += employee.getSalary();
            }
        }

        System.out.println("Total salary of all employees: $" + totalSalaryAllEmployees);
        System.out.println("Total salary of all managers: $" + totalSalaryAllManagers);
        System.out.println("Total salary of all workers: $" + totalSalaryAllWorkers);

        int searchId = 1;
        System.out.println("Matching employees with ID " + searchId + ":");
        for (Employee employee : employees) {
            if (employee instanceof Worker && ((Worker) employee).getId() == searchId) {
                System.out.println("- " + employee.getName());
            }
        }
    }
}