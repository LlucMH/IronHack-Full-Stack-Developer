public class Intern extends Employee {
    private static final double MAX_SALARY = 20000;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, validateSalary(salary));
    }

    public static double validateSalary(double salary) {
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("Intern salary cannot exceed " + MAX_SALARY);
        }
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("Intern salary cannot exceed " + MAX_SALARY);
        }
        super.setSalary(salary);
    }
}
