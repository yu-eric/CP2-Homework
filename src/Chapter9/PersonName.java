package Chapter9;

public class PersonName implements Comparable {

    public PersonName(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Object anotherPerson) {
        PersonName ap = (PersonName) anotherPerson;
        if(this.name.equals(ap.getName())) {
            return 0;
        } else {
            return name.compareTo(ap.getName());
        }
    }

}
