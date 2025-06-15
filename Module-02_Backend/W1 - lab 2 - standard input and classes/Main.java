import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", "alice@email.com", 30, 50000));
        employees.add(new Employee("Bob", "bob@email.com", 35, 60000));
        employees.add(new Intern("Charlie", "charlie@email.com", 22, 15000));
        employees.add(new Intern("Diana", "diana@email.com", 21, 18000));
        employees.add(new Employee("Eve", "eve@email.com", 28, 55000));
        employees.add(new Intern("Frank", "frank@email.com", 23, 12000));
        employees.add(new Employee("Grace", "grace@email.com", 40, 70000));
        employees.add(new Intern("Henry", "henry@email.com", 24, 19000));
        employees.add(new Employee("Ivy", "ivy@email.com", 33, 52000));
        employees.add(new Intern("Jack", "jack@email.com", 20, 19999));

        try (FileWriter writer = new FileWriter("employees.txt")) {
            for (Employee emp : employees) {
                writer.write(emp.toString() + "\n");
            }
            System.out.println("Employee data written to employees.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
