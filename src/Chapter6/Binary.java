package Chapter6;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an integer to convert into binary, or enter 0 to quit: \n");
        int integerInput = in.nextInt();

        while(integerInput != 0) {

            while(integerInput > 0) {
                int binary = integerInput % 2;
                System.out.println(binary);
                integerInput = integerInput / 2;
            }
            System.out.println("Enter another number, or enter 0 to quit: ");
            integerInput = in.nextInt();
        }
        System.out.println("Exiting... ");
    }

}
