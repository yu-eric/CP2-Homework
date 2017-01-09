package Chapter6;
import java.util.Scanner;

public class IntRead {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side length of a square (must be greater than 1): ");
        int sideLength = in.nextInt();

        for(int y = 0; y < sideLength; y++) {

            for(int x = 0; x < sideLength; x++) {
                System.out.print("*");
            }

            System.out.print("\t");

            for(int x = 0; x < sideLength; x++) {

                if(x == 0 || x == sideLength - 1) {
                    System.out.print("*");

                } else {

                    if(y == 0 || y == sideLength - 1) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }

    }
}
