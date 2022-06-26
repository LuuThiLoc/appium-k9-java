package lesson_08;
import static lesson_08.HouseWithBuilder.Builder;

public class TestHouseBuilder {

    public static void main(String[] args) {
        //HouseWithBuilder.Builder builder = new HouseWithBuilder.Builder();
        //HouseWithBuilder.Builder: giống class member trực thuộc class
        //Remove: HouseWithBuilder by import STATIC Class --> STATIC INNER CLASS

//        Builder builder = new Builder();
//
//        builder.setDoorNum(9);
//        builder.setTopRoofColor("Red");
//        builder.setColor("Green");
//
//        HouseWithBuilder house = builder.builder(); // builder(): return new HouseWithBuilder(this) --> object của HouseWithBuilder.
//
//        System.out.println(house);

        //BUILDER DESIGN PATTERN: giúp giải quyết 2 vấn đề
        //house.get() --> Read-only --> ko thể thay đổi các attributes bên trong của house --> immutable object.
        //class Builder --> Write-only --> chỉ cho phép thay đổi giá trị các attributes thông qua Setter.


        // METHOD CHAINING
        Builder builder = new Builder();

        HouseWithBuilder house = builder
                .setDoorNum(9)
                .setTopRoofColor("Red") // hàm này return lại chính object builder mà nó đang mang --> this
                .setColor("Green")
                .builder();

        System.out.println(house);
    }
}
