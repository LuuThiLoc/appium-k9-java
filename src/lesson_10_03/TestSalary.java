package lesson_10_03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSalary {

    public static void main(String[] args) {
        Employee teo = new Employee("Teo", 10);
        Employee ti = new Employee("Ti", 11);
        Employee tun = new Employee("Tun", 9);

        List<Employee> employees = Arrays.asList(teo, ti, tun);

        System.out.println("BEFORE==========");
        System.out.println(employees);

        Collections.sort(employees);

        System.out.println("AFTER==========");
        System.out.println(employees);
    }
}
