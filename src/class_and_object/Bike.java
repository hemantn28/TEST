package class_and_object;

public class Bike {
    //datamember
    String name;
    double price;
    int speed;

    //parameterized constructor

    public Bike(String name, double price, int speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    public static void main(String[] args) {
        Bike obj=new Bike("Hero",85231.45,90);
        System.out.println(obj.name);
        System.out.println(obj.price);
        System.out.println(obj.speed);
        Bike obj2=new Bike("Bajaj",89612.5,86);
        System.out.println(obj2.name);
        System.out.println(obj2.price);
        System.out.println(obj2.speed);
        Bike obj3=new Bike("TVS",74362.54,90);
        System.out.println(obj3.name);
        System.out.println(obj3.price);
        System.out.println(obj3.speed);
    }
}
