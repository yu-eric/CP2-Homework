package Chapter9;

public final class Student extends Person {
    protected String major;

    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    public String work() {
        return "Submits an assignment";
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return "[Student: " + super.toString() + ", Does: " + work() + ", Major: "
                + getMajor() + " ]";
    }
}
