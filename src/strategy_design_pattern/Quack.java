package strategy_design_pattern;

public class Quack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Quack!! Quack!!");
    }
}
