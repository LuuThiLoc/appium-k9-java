package lesson_lab_09;

public class FTE extends Employee {

    public FTE(int salary, int employeeNumber) {
        super(salary, employeeNumber);
        System.out.println("Full time employee Salary is: " + salary);
        System.out.println("Full time employee Number is: " + employeeNumber);
    }

    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public int getEmployeeNumber() {
        return 3;
    }
}
