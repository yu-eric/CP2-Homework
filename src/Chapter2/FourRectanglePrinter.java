package Chapter2;

import java.awt.*;

public class FourRectanglePrinter {

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(0, 0, 50, 100);
        System.out.println(myRectangle);


        myRectangle.translate(50,0);
        System.out.println(myRectangle.getX() + "," + myRectangle.getY());




        myRectangle.translate(0,100);
        System.out.println(myRectangle.getX() + "," + myRectangle.getY());


        myRectangle.translate(-50,0);
        System.out.println(myRectangle.getX() + "," + myRectangle.getY());
    }
}