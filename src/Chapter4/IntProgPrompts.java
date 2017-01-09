package Chapter4;

import java.util.Scanner;


public class IntProgPrompts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int firstNum = in.nextInt();

        System.out.print("Enter your second number: ");
        int secondNum = in.nextInt();

        int sumNum = firstNum + secondNum;
        int diffNum = firstNum - secondNum;
        int prodNum = firstNum * secondNum;
        int avgNum = (firstNum + secondNum) / 2;
        int absNum = Math.abs(diffNum);

        System.out.printf("The sum is %s. ", sumNum);
        System.out.printf("The difference is %s. ", diffNum);
        System.out.printf("The product is %s. ", prodNum);
        System.out.printf("The average is %s. ", avgNum);
        System.out.printf("The absolute value is %s. ", absNum);


        if(firstNum > secondNum){
            int maxNum = firstNum;
            int minNum = secondNum;
            System.out.printf("The larger number is %s. ", maxNum);
            System.out.printf("The smaller number is %s. ", minNum);
        }

        if(secondNum > firstNum) {
            int maxNum = secondNum;
            int minNum = firstNum;
            System.out.printf("The larger number is %s. ", maxNum);
            System.out.printf("The smaller number is %s. ", minNum);
        }
        else {
            System.out.println("The two numbers are the same!");
        }


    }

}
