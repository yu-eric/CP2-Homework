package Chapter7;

public class randInt {

    public static void main(String[] args) {
        int[] randomInteger = new int[10];

        for(int i = 0; i < 10; i++) {
            randomInteger[i] = (int) (Math.random() * 100 + 1);
        }

        System.out.printf("Every even index: \n%d \n%d \n%d \n%d \n%d \n", randomInteger[0], randomInteger[2], randomInteger[4], randomInteger[6], randomInteger[8]);

        System.out.println("\nEvery even number:");
        for(int i = 0; i < 10; i++) {
            if (randomInteger[i] % 2 == 0) {
                System.out.println(randomInteger[i]);
            }
        }

        System.out.println();
        System.out.println("All numbers in reverse order: ");
        for(int i = 9; i >=0; i--) {
            System.out.println(randomInteger[i]);
        }

        System.out.printf("\nFirst and last numbers: \n%d \n%d", randomInteger[0], randomInteger[9]);
    }
}
