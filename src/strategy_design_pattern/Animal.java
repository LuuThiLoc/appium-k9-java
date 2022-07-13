package strategy_design_pattern;

import java.security.SecureRandom;

public class Animal {
    Flyable flyable;
    private String name;
    private int speed;

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "flyable=" + flyable +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    public Animal(String name, int speed) {
        this.name = name;
        this.speed = new SecureRandom().nextInt(speed);
    }

    boolean flyAble() {
        return flyable.flyAble();
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
