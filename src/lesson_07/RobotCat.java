package lesson_07;

// Parent class | Supper class
public class RobotCat extends GrandParent{
    private String name;
    private String productionDate;


    // constructor ko có đối số: để bất kì class con nào extends cũng ko cần gọi constructor nào cả mà vẫn sử dụng đc.
    public RobotCat() {
    }


    // constructor đầy đủ đối số: class con ko cần làm gì cả, chỉ cần sử dụng lại.
    public RobotCat(String name) {
        this.name = name;
    }


    public RobotCat(String name, String productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }


    public String charge(){
        return "Charging";
    }

    @Override
    public String toString() {
        return "RobotCat{" +
                "name='" + name + '\'' +
                ", productionDate='" + productionDate + '\'' +
                '}';
    }

}
