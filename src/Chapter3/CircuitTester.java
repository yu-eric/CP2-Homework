package Chapter3;

/**
 Tests the Chapter3.Circuit Class
 **/
public class CircuitTester{

    /**
     * The main method of the class that tests the Chapter3.Circuit class
     * @param args ** Not Used
     **/
    public static void main(String[] args){
        Circuit circuit1 = new Circuit();
        System.out.println("SwitchOne State = " + circuit1.getSwitchOneState() + " SwitchTwo State " + circuit1.getSwitchTwoState() + " Lamp State = " + circuit1.getLampState());
        circuit1.toggleSwitchOne();
        System.out.println("SwitchOne State = " + circuit1.getSwitchOneState() + " SwitchTwo State " + circuit1.getSwitchTwoState() + " Lamp State = " + circuit1.getLampState());
        circuit1.toggleSwitchTwo();
        System.out.println("SwitchOne State = " + circuit1.getSwitchOneState() + " SwitchTwo State " + circuit1.getSwitchTwoState() + " Lamp State = " + circuit1.getLampState());

        Circuit circuit2 = new Circuit(1, 1, 1);
        System.out.println("SwitchOne State = " + circuit2.getSwitchOneState() + " SwitchTwo State " + circuit2.getSwitchTwoState() + " Lamp State = " + circuit2.getLampState());
        circuit2.toggleSwitchOne();
        System.out.println("SwitchOne State = " + circuit2.getSwitchOneState() + " SwitchTwo State " + circuit2.getSwitchTwoState() + " Lamp State = " + circuit2.getLampState());
        circuit2.toggleSwitchTwo();
        System.out.println("SwitchOne State = " + circuit2.getSwitchOneState() + "S witchTwo State " + circuit2.getSwitchTwoState() + " Lamp State = " + circuit2.getLampState());

    }
}