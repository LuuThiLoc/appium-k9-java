package lesson_lab_08;

public class AnimalWithBuilder {
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
        return "AnimalWithBuilder{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", wings=" + flyable +
                '}';
    }

    protected AnimalWithBuilder(Builder builder) {
        name = builder.name;
        speed = builder.speed;
        flyable = builder.flyable;
    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean flyable;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            if (flyable == true)  {
                throw new IllegalArgumentException("Animal with wings can't be allow to run!");
            }
            this.flyable = false;
            return this;
        }

        public AnimalWithBuilder builder() {
            return new AnimalWithBuilder(this);
        }
    }
}
