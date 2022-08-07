package strategy_design_pattern;

public class Eagle extends Animal{
    private static final int EAGLE_MAX_SPEED = 90;

    public Eagle(){
        super("Eagle", EAGLE_MAX_SPEED);
        flyable = new FlyWithWings();
    }
}
