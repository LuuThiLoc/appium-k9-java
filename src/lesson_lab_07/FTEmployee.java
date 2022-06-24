package lesson_lab_07;

public class FTEmployee extends Employee {

    public FTEmployee(int salary, int employeeNumber) {
        super(salary, employeeNumber);
        System.out.println("Full time employee Salary is: " + salary);
        System.out.println("Full time employee Number is: " + employeeNumber);
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
