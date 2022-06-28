package lesson_lab_07;

import java.security.SecureRandom;

public class AnimalFix {
    private String name;
    private int speed;

    public AnimalFix() {
    }

    public AnimalFix(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public int getSpeed() {
        return this.speed; //speedRandom chỉ đc sinh ra 1 lần và ko change đc nữa, chỉ cho get ra --> control attribute
    }

    public String getName() {
        return name;
    }
}
