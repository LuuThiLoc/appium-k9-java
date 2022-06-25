package lesson_lab_07;

import java.util.Arrays;
import java.util.List;

public class EmployeePayment {

    //    Create a class Employee with a method salary to return employee’s salary
//    There are 2 types of employee: Full time employee and contract employee
//    Full time employee has salary is 50000 and contract employee has salary 40000
//    Write a method to accept a list of Employee and calculate total salary
//    For example, company has 3 FTE and 2 contractor

    public static void main(String[] args) {

        EmployeePayment employeePayment = new EmployeePayment();

        Employee ftEmployee = new FTEmployee(50000, 3);
        Employee ctEmployee = new CTEmployee(40000, 2);

        //Calculate total employee numbers:
        int ftEmNumber = ftEmployee.getEmployeeNumber();
        int ctEmNumber = ctEmployee.getEmployeeNumber();
        int totalEmployeeNumber = ftEmNumber + ctEmNumber;
        System.out.println("Total employee numbers is: " + totalEmployeeNumber);

        //Calculate total salary:
        int ftEmSalary = ftEmployee.getSalary();
        int ctEmSalary = ctEmployee.getSalary();
        int totalSalary = (ftEmSalary*ftEmNumber) + (ctEmSalary*ctEmNumber);
        System.out.println("Total salary is: " + totalSalary);


        employeePayment.calculateTotalSalary(Arrays.asList(ftEmployee, ctEmployee));
        employeePayment.calculateTotalEmployeeNumber(Arrays.asList(ftEmployee, ctEmployee));
    }

    public void calculateTotalSalary(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            employee.calculateSalary();
        }
    }

    public void calculateTotalEmployeeNumber(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            employee.calculateEmployeeNumber();
        }
    }
}
