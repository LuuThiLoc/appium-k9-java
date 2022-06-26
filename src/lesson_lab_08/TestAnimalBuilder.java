package lesson_lab_08;

import static lesson_lab_08.AnimalWithBuilder.Builder;

public class TestAnimalBuilder {

//    Racing animal with builder design pattern (adding attribute flyable)
//    Eagle, Falcon, Tiger, Snake....
//    Animal tiger = new Animal.Builder().withWings(false).....build();
//    Animal falcon = new Animal.Builder().withWings(true).....build();

    public static void main(String[] args) {

        Builder builder = new Builder();

        AnimalWithBuilder animal = builder
                .setName("Eagle")
                .setSpeed(50)
                .setWings(true)
                .builder();

        System.out.println(animal);
    }
}
