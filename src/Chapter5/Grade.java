package Chapter5;

import java.util.Scanner;
public class Grade {
    public static double getNumericGrade(String letterGrade) {
        double numGrade;
        
        if (letterGrade.toUpperCase().equals("A")) {
            numGrade = 4.0;

        } else if (letterGrade.toUpperCase().equals("B")) {
            numGrade = 3.0;

        } else if (letterGrade.toUpperCase().equals("C")) {
            numGrade = 2.0;

        } else if (letterGrade.toUpperCase().equals("D")) {
            numGrade = 1.0;

        } else if (letterGrade.toUpperCase().equals("F")) {
            return 0;

        } else {
            return -1;
        }

        if (letterGrade.contains("+")) {
            if (numGrade != 4.0) {
                numGrade += 0.3;
            }
        
        } else if (letterGrade.contains("-")) {
            numGrade -= 0.3;
        }

        return numGrade;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a letter grade (can contain + and -): ");
        String input = in.nextLine();
        System.out.println("Your numeric grade is: " + Grade.getNumericGrade(input));

    }
}
