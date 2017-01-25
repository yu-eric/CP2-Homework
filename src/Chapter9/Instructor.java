package Chapter9;

public final class Instructor extends Person {
    protected int salary;

    public Instructor(String name, int yearOfBirth, int salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    public String work() {
        return "Grades assignments and teaches";
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "[Instructor: " + super.toString() + ", Does: " + work()
                + ", Salary: " + getSalary() + " ]";
    }
}
