package Chapter5;

import java.util.Scanner;

public class Date {

    public static String getSeason(int month, int day) {
        String season;
        if (month == 1 || month == 2 || month == 3) {
            season = "Winter";


        } else if (month == 4 || month == 5 || month == 6) {
            season = "Spring";


        } else if (month == 7 || month == 8 || month == 9) {
            season = "Summer";


        } else if (month == 10 || month == 11 || month == 12) {
            season = "Fall";


        } else {
            season = "That is not a valid month. Please enter a valid number.";

        }


        if (month % 3 == 0 && day >= 21) {
            if (season.equals("Winter")) {
                season = "Spring";


            } else if (season.equals("Spring")) {
                season = "Summer";


            } else if (season.equals("Summer")) {
                season = "Fall";


            } else if(season.equals("Fall")) {
                season = "Winter";


            } else {
                season = "Could not calculate next season. Please try again.";

            }

        }
        return season;

    }

    public static void main(String[] args) {
        String getSeason;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a day ");
        int day = in.nextInt();
        System.out.println("Enter a month: ");
        int month = in.nextInt();

        System.out.println("It is " + Date.getSeason(month, day));


    }


}

