package Chapter10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
    private int counter;

    public void actionPerformed(ActionEvent event) {
        counter += 1;
        if (counter == 1) {
            System.out.println("I was clicked " + counter + " time.");
        } else{
            System.out.println("I was clicked " + counter + " times.");
        }
    }
}
