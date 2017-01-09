package Chapter6;
import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the price for one U.S. Dollar in Japanese Yen today?: \n");
        double oneUSDollarInYen = in.nextDouble();
        System.out.println("Enter a dollar amount to convert into yen, or enter 0 to quit: \n");
        double dollarToYen = in.nextDouble();


        while(dollarToYen!= 0) {
            double yen = oneUSDollarInYen * dollarToYen;

            System.out.printf("The price of %.2f in yen is %.2f \n", dollarToYen, yen);
            System.out.println("Enter another dollar amount to convert, or enter 0 to quit: \n");
            dollarToYen = in.nextDouble();

        }

        System.out.println("Exiting the calculator...");

    }
}
