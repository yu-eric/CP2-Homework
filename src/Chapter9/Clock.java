package Chapter9;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Clock {
    private int hours;
    private int minutes;

    public Clock() {
        Calendar rightNow = new GregorianCalendar();
        minutes = rightNow.get(Calendar.MINUTE);
        hours = rightNow.get(Calendar.HOUR);
    }

    public void setHours(int hours)  {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getTime() {
        return String.format("%d:%02d", getHours(), getMinutes());
    }

}
