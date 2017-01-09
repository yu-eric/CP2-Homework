package Chapter4;

import java.util.Scanner;

public class InputUserGas {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("How many gallons of gas is in your tank? ");
        double gasAmt = in.nextDouble();

        System.out.print("What is the fuel efficiency in gallons? ");
        double fuelEff = in.nextDouble();

        System.out.print("What is the price of a gallon of gas? ");
        double galPrice = in.nextDouble();

        double mileCost = (100 * galPrice) / fuelEff;
        double carGas = fuelEff * gasAmt;

        System.out.printf("To drive 100 miles, it would cost you %s. ", mileCost);
        System.out.printf("You can drive %s miles before your car stops running.", carGas);
    }

}

