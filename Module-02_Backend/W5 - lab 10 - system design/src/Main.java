import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        students.put("Alice", new Student("Alice", 80));
        students.put("Bob", new Student("Bob", 72));
        students.put("Charlie", new Student("Charlie", 91));
        students.put("Diana", new Student("Diana", 68));

        System.out.println("Grades before increase:");
        for (Student s : students.values()) {
            System.out.println(s);
        }

        StudentUtils.increaseGrades(students);

        System.out.println("\nGrades after 10% increase:");
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }
}