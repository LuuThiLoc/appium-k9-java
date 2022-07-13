package strategy_design_pattern;

public class Mute implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Mute!!");
    }
}
