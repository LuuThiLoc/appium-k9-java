package lesson_lab_07;

public class HorseFix extends AnimalFix {
    private static int HORSE_MAX_SPEED = 75; //static: dc sinh ra trc object

    public HorseFix() {
        super(HORSE_MAX_SPEED);
    }
}
