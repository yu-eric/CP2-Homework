package Chapter9;

public class AbstractTester {

    public static void main(String[] args) {
        Instructor instructor = new Instructor("Randy", 1984, 45000);
        Student student = new Student("Bob", 1995, "Computer Science");

        System.out.println(instructor);
        System.out.println(student);
    }
}
