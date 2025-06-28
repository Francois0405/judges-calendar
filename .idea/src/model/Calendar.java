package model;
import view.CalendarException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private int year;
    private int month;
    private int day;
    private Employee employee;
    // List to save the employees
    private List<Employee> employeeList = new ArrayList<>();




    //--------------------------------------------EMPLOYEES ONLY-------------------------------------------------------------------
    //Add the new employee
    public void addEmployee(String name, int numbJutj, int workingPts) {
        Employee newEmp = new Employee(name, numbJutj, workingPts);
        employeeList.add(newEmp);
        System.out.println("New employee added succesfuly " + newEmp);
    }

    public void showEmployes(){
        for (Employee emp: employeeList){
            System.out.println(emp+"\n");
        }
    }
    public void addHolidays(String name, int numbJutj, int dayHoliday){
        for (Employee emp: employeeList){
            if (name.equals(emp.getName()) && numbJutj==emp.getNumbJutj()){
                emp.holiday(dayHoliday);
            }
        }

    }







    // ---------------------------------- Safe file ----------------------------------

    public void saveCalendar(String camiDesti) throws CalendarException {
        try (FileOutputStream fout = new FileOutputStream(camiDesti);
             ObjectOutputStream oos = new ObjectOutputStream(fout)) {

            oos.writeObject(this);
            System.out.println("Calenary saved succesfuly" + camiDesti);
        } catch (IOException e) {
            throw new CalendarException("Error saving: " + e.getMessage());
        }
    }

    // ---------------------------------- Load file ----------------------------------

    public static Calendar loadCalendar(String camiOrigen) throws CalendarException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(camiOrigen))) {
            Object obj = ois.readObject();
            if (obj instanceof Calendar) {
                System.out.println("Calendary loaded succesfuly at " + camiOrigen);
                return (Calendar) obj;
            } else {
                throw new CalendarException("The file has not an object type Calendary.");
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new CalendarException("Error loading the calendary: " + e.getMessage());
        }
    }
}
