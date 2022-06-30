package lesson_lab_08;

import java.security.SecureRandom;

public class Animal {

    public Animal() {
    }

    private String name;
    private int speed;
    private boolean flyable;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }

    public Animal(Builder builder){
        name = builder.name;
        speed = builder.speed;
        flyable = builder.flyable;
    }

    public static class Builder{
        private String name;
        private int speed;
        private boolean flyable;

        public void setName(String name) {
            this.name = name;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void setFlyable(boolean flyable) {
            this.flyable = flyable;
        }

        public Animal builder(){
            return new Animal(this);
        }
    }

    public static void main(String[] args) {

    }
}
