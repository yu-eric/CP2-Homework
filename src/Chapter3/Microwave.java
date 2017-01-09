package Chapter3;

public class Microwave {
    private int timeSec;
    private int power;

    public Microwave() {
        this.resetButton();
    }
    public void startButton() {
        System.out.println("Cooking for " + timeSec + " seconds at power level " + power);
    }
    public void timeIncreaseButton() {
        timeSec += 30;
    }
    public void powerLevelButton() {
        if (power == 1) {
            power = 2;
        } else {
            power = 1;
        }
    }
    public void resetButton() {
        timeSec = 0;
        power = 1;
    }
}