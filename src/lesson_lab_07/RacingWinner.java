package lesson_lab_07;

//    This is the first simple version racing contest problem.
//    Racing animal simple version*
//    Horse: Max 75 km/h
//    Tiger: Max 100 Km/h
//    Dog: Max 60 KM/h*
//    Create an Animal class with a method speed() which return a random speeds
//    Create 3 objects for those 3 animal type
//    Run and see which animal is winner for racing
//    Bonus: Default name with Class variable
//    Format: Winner is <Animal name>, with speed: <speed>
//    Hints:* * Class name can get from: object.getClass().getSimpleName();
//    int randomSpeed = new SecureRandom().nextInt(50);

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingWinner {

    public static void main(String[] args) {
        RacingWinner animalRacing = new RacingWinner();

        Animal horse = new Horse("Horse", 75);
        Animal tiger = new Tiger("Tiger", 100);
        Animal dog = new Dog("Dog", 60);


        List<Integer> animalSpeedList = new ArrayList<>();
        int horseSpeed = 0;
        int tigerSpeed = 0;
        int dogSpeed = 0;

        if (horse.speed() < horse.getSpeed()) {
            horseSpeed = horse.speed();
        } else {
            System.out.println("Max Speed of Horse is: 75 km/h");
        }

        if (tiger.speed() < tiger.getSpeed()) {
            tigerSpeed = tiger.speed();
        } else {
            System.out.println("Max Speed of Tiger is: 100 km/h");
        }

        if (dog.speed() < dog.getSpeed()) {
            dogSpeed = dog.speed();
        } else {
            System.out.println("Max Speed of Dog is: 60 km/h");
        }

        animalSpeedList.add(horseSpeed);
        animalSpeedList.add(tigerSpeed);
        animalSpeedList.add(dogSpeed);

        Collections.sort(animalSpeedList);
        System.out.println(animalSpeedList);

        int maxAnimalSpeed = animalSpeedList.get(2);
        System.out.printf("Winner is the animal with max speed: %d", maxAnimalSpeed);


        //animalRacing.getWinner(Arrays.asList(horse, tiger, dog));
    }


//    public void getWinner(List<Animal> animalList) {
//        for (Animal animal : animalList) {
//            animal.getAnimalSpeed();
//        }
//        System.out.printf("Winner is %s, with speed: %d", "name", "speed");
//    }

}
