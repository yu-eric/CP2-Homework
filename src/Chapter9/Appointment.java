package Chapter9;

public class Appointment {
    private String description;
    private Date appointmentDate;


    public Appointment(int year, int month, int day, String description) {
        this.appointmentDate = new Date(year, month, day);
        this.description = description;
    }

    public boolean occursOn(int year, int month, int day) {     //One time occurrence
        if(day == appointmentDate.getDay() && month == appointmentDate.getMonth() && year == appointmentDate.getYear()) {
            return true;
        } else {
            return false;
        }
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDay() {
        return appointmentDate.getDay();
    }

    public int getMonth() {
        return appointmentDate.getMonth();
    }

    public int getYear() {
        return appointmentDate.getYear();
    }
}
