package task3.task33;

public class Emp {
    private final String last_name;
    private final int salary;

    public Emp(String last_name, int salary) {
        this.last_name = last_name;
        this.salary = salary;
    }

    public String getName() {
        return last_name;
    }

    public int getSalary() {
        return salary;
    }
}
