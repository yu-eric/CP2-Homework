package Interfaces;

import java.util.Scanner;

public class DuckTester {

    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        System.out.println(duck1.display());
        Flyable duck2 = new RedheadDuck();
        System.out.println(duck2.fly());

        if(duck2 instanceof Duck) {
            System.out.println(((Duck) duck2).swim());
        }

        System.out.println("Which type of duck do you want to create: ");
        System.out.println(" 1 - Redhead duck");
        System.out.println(" 2 - Mallard duck");
        System.out.println(" 3 - Rubber duck");

        Scanner in = new Scanner(System.in);
        int type = in.nextInt();

        Duck duck = null;
        switch (type) {
            case 1:
                duck = new RedheadDuck();
                break;
            case 2:
                duck = new MallardDuck();
                break;
            case 3:
                duck = new RubberDuck();
                break;
            default:
                System.out.println("Not a valid option.");
        }
        if(duck == null) {
            System.out.println("You didn't choose a valid duck\nGame over");
        }

        if (duck instanceof RubberDuck) {
            System.out.println(duck.display());
        } else if(duck instanceof Flyable) {
            System.out.println(((Flyable) duck).fly());
        }
    }
}
