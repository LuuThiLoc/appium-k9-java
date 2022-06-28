package lesson_09;

import java.util.List;

public class SalaryCalculator {

//    public int getTotalSalary(List<Employee> employeeList){
//        int totalSalary = 0;
//        for (Employee employee : employeeList) {
//            //Casting - Ép kiểu | NOT Recommend | BAD practice
//            if (employee instanceof FTE){ //nếu employee đang xét là 1 instance của FTE
//                totalSalary = totalSalary + employee.getSalary() + ((FTE)employee).supportMoney(); //(FTE)employee: là 1 object của FTE
//
//            } else {
//                totalSalary = totalSalary + employee.getSalary();
//            }
//        }
//        return totalSalary;
//    }

    public int getTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
                totalSalary += employee.getSalary() + employee.supportMoney(); //(FTE)employee: là 1 object của FTE
        }
        return totalSalary;
    }
}
