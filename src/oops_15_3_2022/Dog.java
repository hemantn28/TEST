package oops_15_3_2022;

public class Dog {
    //data
    String name;
    String breed;
    int weight;

    //member or function or method
    //bark
    public void bark(){
        System.out.println("Dog barks");
    }
    //bite
    public void bite(){
        System.out.println("Dog bites");
    }
    //run
    public void run(){
        System.out.println("Dog runs");
    }
    //eat
    public void eat(){
        System.out.println("Dog eats");
    }
    //play
    public void play(){
        System.out.println("Dog plays");
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void getBreed(){
        System.out.println(this.breed);
    }
    public  void getWeight(){
        System.out.println(this.weight);
    }

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.bark();
        d1.bite();
        d1.run();
        d1.eat();
        d1.play();
        d1.name="Lucy";
        d1.breed="Husky";
        d1.weight=40;
        d1.getName();
        d1.getBreed();
        d1.getWeight();

    }
}
