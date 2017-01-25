package Chapter9;

public class WorldClock extends Clock {

    public WorldClock(int offset) {
        super();
        setHours(getHours() + offset);
    }

    public void setHours(int hours) {
        if (hours > 12) {
            hours %= 12;
        }
        super.setHours(hours);
    }
}
