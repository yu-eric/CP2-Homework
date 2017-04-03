package Chapter10;

import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class TrafficLight extends JComponent{

    public void paintComponent(Graphics g){
        Color darkGreen = new Color(15, 30, 15);

        Rectangle tLight = new Rectangle(0, 0, 300, 580);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(darkGreen);
        g2.fill(tLight);
        g2.draw(tLight);

        Ellipse2D.Double redLight = new Ellipse2D.Double(75,20, 150, 150);
        g2.setColor(Color.red);
        g2.fill(redLight);
        g2.draw(redLight);

        Ellipse2D.Double yellowLight = new Ellipse2D.Double(75, 200, 150, 150);
        g2.setColor(Color.yellow);
        g2.fill(yellowLight);
        g2.draw(yellowLight);

        Ellipse2D.Double greenLight = new Ellipse2D.Double(75, 380, 150, 150);
        g2.setColor(Color.green);
        g2.fill(greenLight);
        g2.draw(greenLight);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,580);
        frame.setTitle("Traffic Light");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TrafficLight trafficlight = new TrafficLight();
        frame.add(trafficlight);
        frame.setVisible(true);
    }

}
