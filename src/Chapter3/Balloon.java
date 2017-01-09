package Chapter3;

import static java.lang.Math.PI;

public class Balloon {
    private double radius;

    public Balloon(double balloonRadius) {
        this.radius = balloonRadius;

    }

    public void inflate(double amount) {
        this.radius += amount;
    }

    public double getVolume() {
        return (4 / 3) * PI * (radius * radius * radius);
    }

}
