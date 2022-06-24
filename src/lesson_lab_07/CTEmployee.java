package lesson_lab_07;

public class CTEmployee extends Employee {

    public CTEmployee(int salary, int employeeNumber) {
        super(salary, employeeNumber);
        System.out.println("Contract Employee Salary is: " + salary);
        System.out.println("Contract Employee Number is: " + employeeNumber);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public int getEmployeeNumber() {
        return super.getEmployeeNumber();
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary();
    }

    @Override
    public int calculateEmployeeNumber() {
        return super.calculateEmployeeNumber();
    }
}
