package lesson_lab_09;

public abstract class Employee {
    private int salary;
    private int employeeNumber;

    public Employee() {
    }

    public Employee(int salary, int employeeNumber) {
        this.salary = salary;
        this.employeeNumber = employeeNumber;
    }
    public abstract int getSalary();
    public abstract int getEmployeeNumber();

}

