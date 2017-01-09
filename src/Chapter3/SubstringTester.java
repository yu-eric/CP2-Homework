package Chapter3;

import java.util.Scanner;

public class SubstringTester {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a 5 digit, non negative whole number. Press enter to continue. ");
        int number = in.nextInt();
        String numberString = String.valueOf(number);

        if(number >= 10000 && number <100000) {
            System.out.println(numberString.substring(0,1));
            System.out.println(numberString.substring(1,2));
            System.out.println(numberString.substring(2,3));
            System.out.println(numberString.substring(3,4));
            System.out.println(numberString.substring(4,5));
        }
            
        else {
            System.out.println("That is not a valid number. Please enter a 5 digit, non negative whole number. Press enter to continue.");
        }
    }
}