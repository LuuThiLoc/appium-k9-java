package lesson_10_03;

public class Employee implements Comparable<Employee> {
    private String name;
    private int salary;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee that) {
        //return this.getSalary() - that.getSalary();//sort từ nhỏ đến lớn
        return that.getSalary() - this.getSalary();//sort từ lớn đến nhỏ
    }
}
