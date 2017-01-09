package Chapter2;

import java.awt.*;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {

    public void paint(Graphics g) {

        Rectangle myRectangle = new Rectangle(0, 0, 50, 100);
        System.out.println(myRectangle);
        g.drawRect ((int)myRectangle.getX(), (int)myRectangle.getY(), (int)myRectangle.getWidth(), (int)myRectangle.getHeight());


        myRectangle.translate(50,0);
        System.out.println(myRectangle);
        g.drawRect ((int)myRectangle.getX(), (int)myRectangle.getY(), (int)myRectangle.getWidth(), (int)myRectangle.getHeight());




        myRectangle.translate(0,100);
        System.out.println(myRectangle);
        g.drawRect ((int)myRectangle.getX(), (int)myRectangle.getY(), (int)myRectangle.getWidth(), (int)myRectangle.getHeight());



        myRectangle.translate(-50,0);
        System.out.println(myRectangle);
        g.drawRect ((int)myRectangle.getX(), (int)myRectangle.getY(), (int)myRectangle.getWidth(), (int)myRectangle.getHeight());

    }
}

public class RectangleGui {
    public static void main(String[] a) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, 100, 222);
        window.getContentPane().add(new MyCanvas());
        window.setVisible(true);
    }
}