package oops_14_3_2022;

class Person{
    String name;
    int age;


    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Pen {
    //data
    String color;
    String type;
    int price;

    //functions or methods or members
    //write
    public void write(){
        System.out.println("You can write with this pen");
    }
    public void getInfo(){
        System.out.println(this.color+" "+this.type+" "+this.price);
    }



    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.color="blue";
        p1.type="Gel pen";
        p1.price=20;
        p1.write();
        p1.getInfo();

        Pen p2=new Pen();
        p2.color="red";
        p2.type="Ball point pen";
        p2.price=10;
        p2.getInfo();

        Pen p3=new Pen();
        p3.color="Yellow";
        p3.type= "Ink pen";
        p3.price=15;
        p3.getInfo();

        Person p=new Person();
        p.name="Ram";
        p.age=24;
        p.printinfo();

        Person p4=new Person();
        p4.name="Suraj";
        p4.age=15;
        p4.printinfo();

        Person p5=new Person();
        p5.name="Vinit";
        p5.age=12;
        p5.printinfo();


    }
}
