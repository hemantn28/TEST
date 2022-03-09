package model;

public class Children {
    String name;
    int age;
    int weight;

    //parameterized constructor

    public Children(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
