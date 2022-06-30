package lesson_10_03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSalary {

    public static void main(String[] args) {
        Employee teo = new Employee("Teo", 10);
        teo.setAge(25);
        Employee ti = new Employee("Ti", 11);
        ti.setAge(18);
        Employee tun = new Employee("Tun", 9);
        tun.setAge(23);
        List<Employee> employees = Arrays.asList(teo, ti, tun);

        System.out.println("BEFORE==========");
        System.out.println(employees);

        Collections.sort(employees);

        System.out.println("AFTER==========");
        System.out.println(employees);

        employees.sort(new EmpAgeComparator()); //đưa vào 1 object
        System.out.println(employees);

//        Collections.sort(employees, new EmpAgeComparator());
        //Muốn sort theo j (tên, tuổi, lương, position...) thì tạo ra 1 class implements Comparator Interfaces,
        // trong đó có nhiều method và chỉ cần override lại
    }
}
