package classobject_14_3_2022.class_object_14_3_2022;

class Child{
    String name;
    int age;
    int weight;

    public Child(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
class Car{
    String name;
    String model;
    int price;

    public Car(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
}
public class Oops_Manoj2 {
    public static void main(String[] args) {
        Child c1=new Child("Nanu",5,10);
        System.out.println(c1.name+" "+c1.age+" "+c1.weight);

        Child c2=new Child("Lovi",2,5);
        System.out.println(c2.name+" "+c2.age+" "+c2.weight);

        Child c3=new Child("Lala",1,3);
        System.out.println(c3.name+" "+c3.age+" "+c3.weight);

        Child c4=new Child("Chhavi",1,2);
        System.out.println(c4.name+" "+c4.age+" "+c4.weight);

        Car v1=new Car("Maruti","Swift",600000);
        System.out.println(v1.name+" "+v1.model+" "+v1.price);

        Car v2=new Car("Toyota","Etios",700000);
        System.out.println(v2.name+" "+v2.model+" "+v2.price);

        Car v3=new Car("Volkswagon","Ameo",800000);
        System.out.println(v3.name+" "+v3.model+" "+v3.price);
    }

}
