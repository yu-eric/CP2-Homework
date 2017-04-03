package Chapter10;

import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonViewer {

    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("First Button");
        frame.add(button);

        JFrame frame1 = new JFrame();
        JButton button1 = new JButton("Second Button");
        frame1.add(button1);

        ActionListener listener = new ClickListener();
        ActionListener listener1 = new ClickListener();
        button.addActionListener(listener);
        button1.addActionListener(listener1);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLocation(860,540);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame1.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame1.setLocation(960,540);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame1.setVisible(true);
    }

}
