import java.time.temporal.ChronoUnit;

public class Instructor extends  Person{
    private  double salary;

    public Instructor(Long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "salary=" + salary +
                "} " + super.toString();
    }

    @Override
    public double period(Group group) {
        long data = ChronoUnit.MONTHS.between(group.getDateOfStart().withDayOfMonth(1),
                group.getDateOfFinish().withDayOfMonth(1));
        return data * salary;
    }
}
