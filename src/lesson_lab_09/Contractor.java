package lesson_lab_09;

public class Contractor extends Employee {

    public Contractor(int salary, int employeeNumber) {
        super(salary, employeeNumber);
        System.out.println("Contract Employee Salary is: " + salary);
        System.out.println("Contract Employee Number is: " + employeeNumber);
    }

    @Override
    public int getSalary() {
        return 40000;
    }

    @Override
    public int getEmployeeNumber() {
        return 2;
    }
}
