package strategy_design_pattern;

public class Tiger extends Animal {
    private static final int TIGER_MAX_SPEED = 80;

    public Tiger() {
        super("Tiger", TIGER_MAX_SPEED);
        flyable = new FlyNoway();
    }
}
