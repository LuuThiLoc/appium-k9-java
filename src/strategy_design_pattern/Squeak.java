package strategy_design_pattern;

public class Squeak implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Squeak!! Squeak!!");
    }
}
