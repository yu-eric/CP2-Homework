package Interfaces;

public class RedheadDuck extends Duck implements Flyable{

    @Override
    public String display() {
        return "I'm a redhead duck!";
    }

    @Override
    public String fly() {
        return "I fly a little differently";
    }
}
