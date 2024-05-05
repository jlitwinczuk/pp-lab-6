import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan Kowalski", 4500, 1, "04.20.2020", "Senior Developer");
        Worker worker2 = new Worker("Jan Niekowalski", 4400, 2, "01.01.2014", "Junior Developer");
        Worker worker3 = new Worker("Jan Nowak", 4300, 1, "09.11.2001", "QA Engineer");

        Manager manager = new Manager("Janusz Kowalski", 6000, 5, "04.05.2024", "Head of Department");


        Employee[] employees = {worker1, worker2, manager};

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " has code: " + employee.hashCode());
        }

        System.out.println(worker2.getName() + " equals " + worker3.getName() + ": " + worker2.equals(worker3));
        System.out.println(worker1.getName() + " equals " + worker3.getName() + ": " + worker1.equals(worker3));
        System.out.println(manager.getName() + " equals " + worker3.getName() + ": " + manager.equals(worker3));
    }
}
