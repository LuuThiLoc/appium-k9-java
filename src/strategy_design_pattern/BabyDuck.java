package strategy_design_pattern;

public class BabyDuck extends Duck {

    public BabyDuck() {
        quackBehaviour = new Squeak();
    }
}
