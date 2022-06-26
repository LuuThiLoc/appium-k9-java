package lesson_lab_08;

public class AnimalWithBuilder {

    public AnimalWithBuilder() {
    }

    private String name = "Horse";
    private int speed = 30;
    private boolean wings = false;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWings() {
        return wings;
    }

    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", wings=" + wings +
                '}';
    }

    protected AnimalWithBuilder(Builder builder) {
        name = builder.name;
        speed = builder.speed;
        wings = builder.wings;
    }

    public static class Builder {
        private String name = "Horse";
        private int speed = 30;
        private boolean wings = false;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setWings(boolean wings) {
            if (wings == true)  {
                throw new IllegalArgumentException("Animal with wings can't be allow to run!");
            }
            this.wings = wings;
            return this;
        }

        public AnimalWithBuilder builder() {
            return new AnimalWithBuilder(this);
        }

    }
}
