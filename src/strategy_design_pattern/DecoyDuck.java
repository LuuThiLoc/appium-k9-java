package strategy_design_pattern;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehaviour = new Mute();
    }
}
