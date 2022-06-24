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

import java.util.*;

public class AnimalRacing {

    public static void main(String[] args) {
        AnimalRacing animalRacing = new AnimalRacing();

        Animal horse = new Horse("Horse", 75);
        Animal tiger = new Tiger("Tiger", 100);
        Animal dog = new Dog("Dog", 60);

        String horseName = horse.getClass().getSimpleName();
        String tigerName = tiger.getClass().getSimpleName();
        String dogName = dog.getClass().getSimpleName();

        Map<String, Integer> animalList = new HashMap<>();
        animalList.put(horseName, horse.speed());
        animalList.put(tigerName, tiger.speed());
        animalList.put(dogName, dog.speed());

        System.out.println("Before sorting: " + animalList);

        List<Integer> animalSpeedList = new ArrayList<>();
        List<String> animalNameList = new ArrayList<>();

        for (String key : animalList.keySet()) {

            animalSpeedList.add(animalList.get(key));
            Collections.sort(animalSpeedList);
            animalNameList.add(key);
        }

        System.out.println("After sorting: " + animalSpeedList);

        int maxSpeed = animalSpeedList.get(2);
        String nameWinner = animalNameList.get(2);
        System.out.printf("Winner is %s, with speed: %d", nameWinner, maxSpeed);
    }
}