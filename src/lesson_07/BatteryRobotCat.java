package lesson_07;

// Sub Class | Child Class | Concrete Class

public class BatteryRobotCat extends RobotCat {

    public BatteryRobotCat() {
        super("Kitty");
    }

//        super() ->gọi constructor từ class cha:

//         public RobotCat(String name) {
//            this.name = name;
//        }


    public BatteryRobotCat(String name, String productionDate) {
        // class con có constructor thì class cha phải có constructor
        // khi ko có constructor bên class cha, thì phải sử dụng super() cho constructor class con -> gọi ít nhất 1 constructor từ class cha.

        super(name, productionDate);
        // super(name.concat(" , meo meo meo"), productionDate);

        // call super() trước trong constructor body
        // constructor class cha: public RobotCat(String name, String productionDate) {}

        //System.out.println("Hello, my name is: " + name);
    }

    @Override
    public String charge() {
        return super.charge() + " with Battery";
    }

//    @Override: lại class cha
//    Reuse method super.charge() của class cha để return value "Charging"

    @Override
    public void doSth() {
        System.out.println("Hi");
    }
}
