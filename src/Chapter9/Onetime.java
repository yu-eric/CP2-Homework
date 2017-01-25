package Chapter9;

public class Onetime extends Appointment {

    public Onetime(int year, int month, int day, String description) {
        super(year, month, day, description);
    }
    public boolean occursOn(int year, int month, int day){
        return super.occursOn(year, month, day);
    }

}
