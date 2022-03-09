package model;

public class Employee {
    String name;
    int salary;
    String deptt;

    //parameterized constructor

    public Employee(String name, int salary, String deptt) {
        this.name = name;
        this.salary = salary;
        this.deptt = deptt;
    }
    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDeptt() {
        return deptt;
    }

    public void setDeptt(String deptt) {
        this.deptt = deptt;
    }
}
