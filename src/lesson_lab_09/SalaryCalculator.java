package lesson_lab_09;

import java.util.Arrays;
import java.util.List;

public class SalaryCalculator {

    //IS-A Relationship
    public int getTotalSalary(List<Employee> employees){
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary = totalSalary + (employee.getSalary() * employee.getEmployeeNumber());
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        Employee ftEmployee = new FTE(50000, 3);
        Employee ctEmployee = new Contractor(40000, 2);

        System.out.println("Total salary is: " + salaryCalculator.getTotalSalary(Arrays.asList(ftEmployee, ctEmployee)));
    }
}
