package strategy_design_pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalRacing {

    Animal getWinner(List<Animal> animalList) {
        List<Animal> nonFlyAbleAnimals = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.flyAble()) {
                nonFlyAbleAnimals.add(animal);
            }
        }

        // Get the winner
        Animal winnerAnimal = nonFlyAbleAnimals.get(0);
        for (Animal animal : nonFlyAbleAnimals) {
            if (winnerAnimal.getSpeed() < animal.getSpeed()) {
                winnerAnimal = animal;
            }
        }
        System.out.printf("The winner is %s, with speed %d: ", winnerAnimal.getName(), winnerAnimal.getSpeed());
        return winnerAnimal;
    }

    public static void main(String[] args) {
        AnimalRacing animalRacing = new AnimalRacing();

        Animal tiger = new Tiger();
        Animal eagle = new Eagle();
        Animal dog = new Dog();

        System.out.println(tiger);
        System.out.println(eagle);
        System.out.println(dog);

        animalRacing.getWinner(Arrays.asList(tiger, eagle, dog));
    }
}
