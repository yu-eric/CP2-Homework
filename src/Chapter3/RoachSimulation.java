package Chapter3;

public class RoachSimulation {
    public static void main(String[] args) {
        RoachPopulation roachPop = new RoachPopulation(10);
        for (int i = 0; i<4; i++) {
            roachPop.roachBreed();
            roachPop.roachSpray();
            System.out.println("Population: " + roachPop.getRoaches());
        }

    }



}
