package Chapter3;

/**
 * This class represents a lamp and two hallway switches
 * The lamp state is controlled by both switches
 **/
public class Circuit {
    private int switchOneState;
    private int switchTwoState;
    private int lampState;

    /**
     * Constructs a circuit with default values
     **/

    public Circuit() {
        this.switchOneState = 0;
        this.switchTwoState = 0;
        this.lampState = 0;
    }

    /**
     * Constructs a circuit with passed in values
     * @param switchOneState- the state of the first switch
     * @param switchTwoState- the state of the second switch
     * @param lampState- the state of the lamp (0 off, 1 on)
     **/
    public Circuit(int switchOneState, int switchTwoState, int lampState) {
        this.switchOneState = switchOneState;
        this.switchTwoState = switchTwoState;
        this.lampState = lampState;
    }
    /**
     * Gets the state of switch oine
     * @return the switch one state
     **/

    public int getSwitchOneState() {
        return switchOneState;
    }
    /**
     * Gets the state of switch two
     * @return the switch two state
     **/
    public int getSwitchTwoState() {
        return switchTwoState;
    }
    /**
     * Gets the state of the lamp
     * @return lampState
     **/
    public int getLampState() {
        return lampState;
    }
    /**
     * Changes the state of the switch
     * This also changes the state of the lamp
     **/
    public void toggleSwitchOne() {
        switchOneState = Math.abs(switchOneState - 1);
        lampState = Math.abs(lampState - 1);
    }
    public void toggleSwitchTwo() {
        switchTwoState = Math.abs(switchTwoState - 1);
        lampState = Math.abs(lampState - 1);
    }
}