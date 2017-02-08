package Interfaces;

public class MallardDuck extends Duck implements Flyable{

    @Override   //Annotation- not required
    public String display() {
        return "I'm a mallard!";
    }

    @Override
    public String fly() {
        return "Spread my wings and fly";

    }
}
