import java.time.temporal.ChronoUnit;

public class Student extends Person {
    private double contract;

    public Student(Long id, String fullName, int age, char gender, double contract) {
        super(id, fullName, age, gender);
        this.contract = contract;
    }

    public double getContract() {
        return contract;
    }

    public void setContract(double contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Student{" +
                "contract=" + contract +
                "} " + super.toString();
    }

    @Override
    public double period(Group group) {
        long data = ChronoUnit.MONTHS.between(group.getDateOfStart().withDayOfMonth(1),
                group.getDateOfFinish().withDayOfMonth(1));
        return data * contract;
    }
}

