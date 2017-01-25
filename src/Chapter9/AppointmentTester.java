package Chapter9;

import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentTester {

    public static void main(String[] args) {
        ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
        appointmentList.add(new Onetime(2017, 3, 10, "Go to the doctor"));      //Change or add appointments
        appointmentList.add(new Monthly(13, "Pay gas bills"));
        appointmentList.add(new Daily("Brush teeth"));

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int userYear = in.nextInt();

        System.out.println("Please enter the month: ");
        int userMonth = in.nextInt();

        System.out.println("Please enter the day: ");
        int userDay = in.nextInt();

        for(int x = 0; x < appointmentList.size(); x++) {
            Appointment app = appointmentList.get(x);

            if(app.occursOn(userYear, userMonth, userDay)) {
                if (app instanceof Onetime) {
                    System.out.println("You have a onetime appointment on that day: " + app.getDescription());
                } else if (app instanceof Monthly) {
                    System.out.println("You have monthly appointment on that day: " + app.getDescription());
                } else if(app instanceof Daily) {
                    System.out.println("You have a daily appointment: " + app.getDescription());
                }
            } else {
                if (app instanceof Onetime) {
                    System.out.println("Your onetime appointment: " + app.getDescription()+ " is not on that day.");
                } else if (app instanceof Monthly) {
                    System.out.println("Your monthly appointment: " + app.getDescription() + " is not on that day.");
                }
            }
        }
    }
}
