package Chapter5;

import java.util.Scanner;

public class ChristmasSongTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a day of Christmas: ");
        String input = in.nextLine();
        ChristmasSong.getGift(input);
        System.out.printf("On the %s day of Christmas, my true love gave to me: \n ", ChristmasSong.whatDay());
        System.out.println(" ");
        System.out.printf(ChristmasSong.whichGift());
        System.out.println(" ");
    }
}
