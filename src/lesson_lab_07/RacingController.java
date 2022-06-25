package lesson_lab_07;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RacingController {

    public int getMaxSpeed(List<Animal_02> animalList) {
        int maxSpeed = 0;

        final int HORSE_MAX_SPEED = 75;
        final int TIGER_MAX_SPEED = 100;
        final int DOG_MAX_SPEED = 60;

        int horseRandomSpeed = new SecureRandom().nextInt(HORSE_MAX_SPEED);
        int tigerRandomSpeed = new SecureRandom().nextInt(TIGER_MAX_SPEED);
        int dogRandomSpeed = new SecureRandom().nextInt(DOG_MAX_SPEED);

        List<Integer> animalRandomSpeedList = Arrays.asList(horseRandomSpeed, tigerRandomSpeed, dogRandomSpeed);
        Collections.sort(animalRandomSpeedList);
        maxSpeed = animalRandomSpeedList.get(2);

        for (Animal_02 animal : animalList) {
            System.out.println(animal.getClass().getSimpleName());
        }

        System.out.printf("Winner is , with speed: %d", maxSpeed);
//        System.out.printf("Winner is %s, with speed: %d", winnerName, maxSpeed);

        return maxSpeed;
    }

    public static void main(String[] args) {

        RacingController racingController = new RacingController();

        Animal_02 horse2 = new Horse_02("Horse");
        Animal_02 tiger2 = new Tiger_02("Tiger");
        Animal_02 dog2 = new Dog_02("Dog");

        racingController.getMaxSpeed(Arrays.asList(horse2, tiger2, dog2));
    }
}
