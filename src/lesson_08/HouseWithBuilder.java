package lesson_08;

// BUILDER DESIGN PATTERN
public class HouseWithBuilder {

    private int doorNum = 1;
    private String topRoofColor = "Red";
    private String color = "White";


    public HouseWithBuilder() {
    }


    // This constructor = new HouseWithBuilder(this)
    protected HouseWithBuilder(Builder builder) {//this: là object đc sinh ra từ class Builder: builder
        doorNum = builder.doorNum;
        topRoofColor = builder.topRoofColor;
        color = builder.color;
    }

    @Override
    public String toString() {
        return "HouseWithBuilder{" +
                "doorNum=" + doorNum +
                ", topRoofColor='" + topRoofColor + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    // READ-ONLY
    public int getDoorNum() {
        return doorNum;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    public String getColor() {
        return color;
    }


    // Customer Service | Inner Class
    public static class Builder {
        private int doorNum = 1;
        private String topRoofColor = "Red";
        private String color = "White";

        //WRITE-ONLY

        public Builder setDoorNum(int doorNum) {
            this.doorNum = doorNum;
            return this; //this -> object: builder
        }

        public Builder setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public HouseWithBuilder builder() {
            return new HouseWithBuilder(this);  //this: là object đc sinh ra từ class Builder.
            // return lại 1 object của class Builder: builder, để truyền object này vào param builder của constructor: protected HouseWithBuilder(Builder builder) {}
        }
    }
}
