import java.util.HashMap;
import java.util.Map;

public class StudentUtils {
    public static Map<String, Student> increaseGrades(Map<String, Student> students) {
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            Student student = entry.getValue();
            int currentGrade = student.getGrade();
            int increasedGrade = (int) Math.min(100, Math.round(currentGrade * 1.10));
            student.setGrade(increasedGrade);
        }
        return students;
    }
}