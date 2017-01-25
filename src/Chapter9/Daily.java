package Chapter9;

public class Daily extends Appointment {

    public Daily(String description) {
        super(-1, -1, -1, description);     //-1 is a placeholder
    }
    public boolean occursOn(int year, int month, int day){
        return true;
    }

}
