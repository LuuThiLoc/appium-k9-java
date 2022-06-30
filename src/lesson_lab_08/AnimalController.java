package lesson_lab_08;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class AnimalController {
    private Animal getWinner(List<Animal> animalList) {
        Animal animalWinner = animalList.get(0);

        for (Animal animal : animalList) {
            if (animal.getSpeed() > animalWinner.getSpeed() && animal.isFlyable()==false){
                animalWinner = animal;
            }
        }
        System.out.println("The winner is: " + animalWinner);
        return animalWinner;
    }

    public static void main(String[] args) {
        AnimalController animalController = new AnimalController();
        Animal.Builder animalBuilder = new Animal.Builder();

        //Eagle
        animalBuilder.setName("Eagle");
        animalBuilder.setSpeed(new SecureRandom().nextInt(70));
        animalBuilder.setFlyable(true);
        Animal eagle = animalBuilder.builder();
        System.out.println(eagle);

        //Falcon
        animalBuilder.setName("Falcon");
        animalBuilder.setSpeed(new SecureRandom().nextInt(50));
        animalBuilder.setFlyable(true);
        Animal falcon = animalBuilder.builder();
        System.out.println(falcon);

        //Tiger
        animalBuilder.setName("Tiger");
        animalBuilder.setSpeed(new SecureRandom().nextInt(80));
        animalBuilder.setFlyable(false);
        Animal tiger = animalBuilder.builder();
        System.out.println(tiger);

        //Snake
        animalBuilder.setName("Snake");
        animalBuilder.setSpeed(new SecureRandom().nextInt(30));
        animalBuilder.setFlyable(false);
        Animal snake = animalBuilder.builder();
        System.out.println(snake);

        animalController.getWinner(Arrays.asList(eagle, falcon, tiger, snake));
    }
}
