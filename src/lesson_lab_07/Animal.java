package lesson_lab_07;

import java.security.SecureRandom;

public class Animal {

    private static String name;
    private int speed;

    public Animal() {
    }

    public Animal(String name, int speed) {
        Animal.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Animal.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int speed(){
        int randomSpeed = new SecureRandom().nextInt(50);
        return randomSpeed;
    }

    public void getAnimalSpeed() {
        System.out.printf("Animal is %s, with speed: %d", name, speed);
    }
}
