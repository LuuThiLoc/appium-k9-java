package lesson_13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestDataFactory {

    public static void main(String[] args) {

        // READING
        String relativeFilePath = "/src/lesson_13/Persons.txt";
        String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);

        List<Employee> employeeList = DataFactory.getListEmployeeFromFile(absoluteFilePath);
        Collections.sort(employeeList);
        System.out.println(employeeList);

        // WRITING
        Employee teo = new Employee("teo", 28, 100000);
        Employee ti = new Employee("ti", 29, 50000);
        Employee tun = new Employee("tun", 30, 80000);
        List<Employee> employeeListToSave = Arrays.asList(teo, ti, tun);

        String employeeDataFile = System.getProperty("user.dir").concat("/src/lesson_13/EmployeeDB.txt");
        DataFactory.saveEmployeeList(employeeListToSave, employeeDataFile);
    }
}