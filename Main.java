import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan Kowalski", 4500, 1);
        Worker worker2 = new Worker("Jan Niekowalski", 4400, 2);
        Worker worker3 = new Worker("Jan Nowak", 4300, 3);
        Worker worker4 = new Worker("Jan Nienowak", 4200, 4);

        Manager manager = new Manager("Janusz Kowalski", 6000, 5);

        System.out.println("1st worker salary: " + worker1.getSalary());
        worker1.work();

        System.out.println("2nd worker salary: " + worker2.getSalary());
        worker2.work();

        System.out.println("3rd worker salary: " + worker3.getSalary());
        worker3.work();

        System.out.println("4th worker salary: " + worker4.getSalary());
        worker4.work();

        System.out.println("Manager salary: " + manager.getSalary());
        manager.work();
    }
}
