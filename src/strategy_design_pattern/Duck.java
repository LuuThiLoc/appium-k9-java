package strategy_design_pattern;

public class Duck {
    QuackBehaviour quackBehaviour;
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void changeQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }
}

