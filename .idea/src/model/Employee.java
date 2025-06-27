package model;

public class Employee {
    int id;
    String name;
    String jutje;

    public Employee(int id, String name, String jutje) {
        this.id = id;
        this.name = name;
        this.jutje = jutje;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
}
