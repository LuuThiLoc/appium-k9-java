package lesson_09;

public class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return 0; //default getSalary() = 0
    }
    public int supportMoney(){
        return 0; //default supportMoney() = 0
    }

}
