package strategy_design_pattern;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
    }
}
