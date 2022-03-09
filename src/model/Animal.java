package model;

public class Animal {
    String name;
    int weight;
    String breed;

    //parameterized constructor

    public Animal(String name, int weight, String breed) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
    }
    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
