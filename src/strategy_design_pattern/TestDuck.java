package strategy_design_pattern;

public class TestDuck {
    void performQuackBehaviour(Duck duck) { //similar with Flyable
        duck.performQuack();
    }

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck babyDuck = new BabyDuck();
        Duck decoyDuck = new DecoyDuck();
        mallardDuck.changeQuackBehaviour(new Mute());

        TestDuck testDuck = new TestDuck();
        testDuck.performQuackBehaviour(mallardDuck);
        testDuck.performQuackBehaviour(babyDuck);
        testDuck.performQuackBehaviour(decoyDuck);
    }
}
