package Chapter9;

public class Monthly extends Appointment {

    public Monthly(int day, String description) {
        super(-1, -1, day, description);
    }
    public boolean occursOn(int year, int month, int day){
        if(day == this.getDay()) {
            return true;
        } else {
            return false;
        }
    }

}

