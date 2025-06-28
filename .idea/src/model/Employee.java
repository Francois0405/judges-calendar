package model;

import java.io.Serializable;

public class Employee extends Calendary implements Serializable {
    String name;
    int numbJutj;
    int workingPts;

    public Employee(String name, int numbJutj, int workingPts) {
        this.name = name;
        this.numbJutj = numbJutj;
        this.workingPts = workingPts;
    }



    public String getName() {
        return name;
    }

    public int getNumbJutj() {
        return numbJutj;
    }

    public int getWorkingPts() {
        return workingPts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumbJutj(int numbJutj) {
        this.numbJutj = numbJutj;
    }

    public void setWorkingPts(int workingPts) {
        this.workingPts = workingPts;
    }

    public void holiday(int dia){
        setWorkingPts(getWorkingPts()-1);
        //Day.marcarDiaDeFiesta()
    }
    public void workingDay(int dia){
        setWorkingPts(getWorkingPts()+1);
        //Day.marcarDiaDeTrabajo
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", numbJutj=" + numbJutj +
                ", workingPts=" + workingPts +
                '}';
    }
}
