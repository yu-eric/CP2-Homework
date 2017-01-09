package Chapter3;

public class BalloonTester {
    public static void main(String[] args) {
        Balloon redBalloon = new Balloon(0);
        redBalloon.inflate(10);
        System.out.println("The radius of the balloon is 0." +
                " After inflating the balloon, the volume is : " + String.format("%.0f", redBalloon.getVolume()));
    }
}
