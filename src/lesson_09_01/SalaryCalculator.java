package lesson_09_01;

import java.util.List;

public class SalaryCalculator {

    //IS-A Relationship
    public int getTotalSalary(List<Employee> employees){
        int totalSalary = 0;
        for (Employee employee : employees) {
                totalSalary += employee.getSalary() + employee.getSupportMoney();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee employee = new FTE("Teo");

//            @Override
//            public int getSalary() {
//                return 0;
//            }
//
//            @Override
//            public int getSupportMoney() {
//                return 0;
//            }

    }

}
