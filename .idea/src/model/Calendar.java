package model;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private int year;
    private int month;
    private int day;

    // List to save the employees
    private List<Employee> employeeList = new ArrayList<>();


    public void addEmployee(String name, int numbJutj, int workingPts) {
        Employee newEmp = new Employee(name, numbJutj, workingPts);
        employeeList.add(newEmp);
        System.out.println("New employee added succesfuly " + newEmp);
    }

}
