package lesson_lab_07;

public class TigerFix extends AnimalFix {
    private static int TIGER_MAX_SPEED = 100;

    public TigerFix() {
        super(TIGER_MAX_SPEED); //super gọi đến constructor cha AnimalFix và truyền maxSpeed vào.
    }
}
