package lesson_lab_07;

import java.util.Arrays;
import java.util.List;

public class SalaryController {

    public int getTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;

        for (Employee employee : employeeList) {
            totalSalary = totalSalary + (employee.getSalary() * employee.getEmployeeNumber());
        }

        return totalSalary;
    }


    public static void main(String[] args) {
        SalaryController salaryController = new SalaryController();

        Employee ftEmployee = new FTEmployee(50000, 3);
        Employee ctEmployee = new CTEmployee(40000, 2);

        System.out.println(salaryController.getTotalSalary(Arrays.asList(ftEmployee, ctEmployee)));
    }

}
