package lesson_10_03;

public class Eagle extends Animal implements IFlyable, MoveAble {

    public Eagle(String name, int speed) {
        super(name, speed);
    }

    @Override
    public boolean flyable() {
        return true;
    }

    @Override
    public boolean moveAble() {
        return true;
    }
}
