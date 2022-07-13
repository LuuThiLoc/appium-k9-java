package strategy_design_pattern;

public class Dog extends Animal {
    private static int DOG_MAX_SPEED = 85;

    public Dog() {
        super("Dog", DOG_MAX_SPEED);
        flyable = new FlyNoway();
    }
}
