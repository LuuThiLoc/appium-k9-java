package lesson_lab_07;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RacingControllerFix {

    public static void main(String[] args) {

        AnimalFix tiger = new TigerFix(); // 1 khi object tiger đc sinh ra thì attribute speed của nó ko dc thay đổi nữa.
        AnimalFix horse = new HorseFix();
        AnimalFix dog = new DogFix();

        System.out.println("Speed of Tiger is: " + tiger.getSpeed());
        System.out.println("Speed of Horse is: " + horse.getSpeed());
        System.out.println("Speed of Dog is: " + dog.getSpeed());

        List<Integer> animalSpeedList = Arrays.asList(horse.getSpeed(), tiger.getSpeed(), dog.getSpeed());
        Collections.sort(animalSpeedList);

        int maxSpeed = animalSpeedList.get(2);

        System.out.printf("Winner is the animal, with speed: %d", maxSpeed);
    }
}
