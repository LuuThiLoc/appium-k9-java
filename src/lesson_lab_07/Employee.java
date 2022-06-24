package lesson_lab_07;

public class Employee {
    private int salary;
    private int employeeNumber;


    public Employee() {
    }


    public Employee(int salary, int employeeNumber) {
        this.salary = salary;
        this.employeeNumber = employeeNumber;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int calculateSalary(){
        return salary;
    }

    public int calculateEmployeeNumber(){
        return employeeNumber;
    }

}

