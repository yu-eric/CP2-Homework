package Chapter9;


public class Alarm extends Clock {
    private int alarmMinutes = -1;
    private int alarmHours = -1;

    public Alarm(int alarmHours, int alarmMinutes) {
        super();
        setAlarm(alarmHours, alarmMinutes);
    }

    public void setAlarm(int hours, int minutes) {
        this.alarmHours = hours;
        this.alarmMinutes = minutes;

    }

    public String getTime(){
        int clockHours = super.getHours();
        int clockMinutes = super.getMinutes();

        if (this.alarmHours < 0 && this.alarmMinutes < 0 ) {    //Catches the -1 and resets the alarm
            return super.getTime();
        }
        boolean soundAlarm;
        if(clockHours > alarmHours) {
            soundAlarm = true;
        } else if(clockHours == alarmHours) {
            if(clockMinutes > alarmMinutes || clockMinutes == alarmMinutes) {
                soundAlarm = true;
            } else {
                soundAlarm = false;
            }
        } else {
            soundAlarm = false;
        }
        if(soundAlarm) {
            this.clearAlarm();
            return super.getTime() + " Alarm";
        } else {
            return super.getTime();
        }
    }

    private void clearAlarm() {
        this.alarmHours = -1;
        this.alarmMinutes = -1;
    }

}