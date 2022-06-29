package lesson_10_03;

import java.util.Arrays;
import java.util.List;

public class RacingController {

    public void flyableRacing(List<IFlyable> flyableAnimals){
        flyableAnimals.get(0).flyable();
    }

    public void nonFlyableRacing(List<MoveAble> nonFlyableAnimals){

    }

    public static void main(String[] args) {

        Eagle eagle = new Eagle("Eagle", 20);
        Cat cat = new Cat("Cat", 70);

        //Has-A relationship
        new RacingController().flyableRacing(Arrays.asList(eagle)); //only Eagle has Flyable
    }
}
