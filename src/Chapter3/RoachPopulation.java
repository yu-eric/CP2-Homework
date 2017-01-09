package Chapter3;

public class RoachPopulation {
    private int population;

    public RoachPopulation(int numRoaches) {
        population = numRoaches;
    }

    public int getRoaches() {
        return population;
    }

    public void roachBreed() {
        population *= 2;
    }

    public void roachSpray() {
        population *= 0.9;
    }
}

