package oops_16_3_22;

/*Create a class employee with following properties and methods:
salary(property)(int)
getSalary(method returning int)
name(property)(string)
getName(method returning string)
setName(method changing name)*/

import java.util.Scanner;

class Employees{
    int salary;
    String name;

    public int getSalary(){
        int salary=86436;
        return salary;
    }
    public String getName(){
        String name="Rashid";
        return name;
    }

}

class Cellphone{

    String color;
    int price;

    public void ring(){
        System.out.println("Mobile is ringing");
    }
    public void vibrate(){
        System.out.println("Mobile is vibrating");
    }
    public void getInfo(){
        System.out.println(this.color);
        System.out.println(this.price);
    }
}

//Create a class square with a method to initialise its side calculating area and perimeter etc.
class Square{

    public void checkArea(int side){
        int area=side*side;
        System.out.println("Area of square is "+area);
    }
    public void printperimeter(int side){
        int perimeter=4*side;
        System.out.println("perimeter is "+perimeter);
    }
}
//Create a class rectangle with a method to initialise its side calculating area and perimeter etc.

class Rectangle{

    public void printarea(int length, int breadth){
        int area=length*breadth;
        System.out.println("Area is "+area);
    }
    public void printPerimeter(int length, int breadth){
        int perimeter=2*(length+breadth);
        System.out.println("perimeter is "+perimeter);
    }
}
//Create a class Tommy Vecetti for Rockstar Games capable of hitting (print hitting), running, firing etc.
class Tommy{

    public void hit(){
        System.out.println("Target is being hit");
    }
    public void run(){
        System.out.println("Target is running");
    }
    public void fire(){
        System.out.println("Target is firing");
    }
}
//Create a class circle with a method to calculate area and circumference.

class Circle{

    public void checkCircumference(double radius,double PI){

        double circumference=2*PI*radius;
        System.out.println("circumference is "+circumference);

    }

    public void checkArea(double radius,double PI){
        double area= PI*radius*radius;
        System.out.println("Area is "+area);
    }
}
/* Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named
       'Triangle' without any parameter in its constructor.*/
class Triangles{

    public void printArea(double base,double height){
        double area=(base*height)/2;
        System.out.println("Area of triangle is "+area);

    }
    public void printPerimeter(int length, int base, int hypotenuse ){
        int perimeter=length+base+hypotenuse;
        System.out.println("perimeter of triangle is "+perimeter);

    }
}
/*Assign and print the roll number, phone number and address of two students having names
     "Sam" and "John" respectively by creating two objects of class 'Student'.*/
class Students{

    String name;
    int roll_No;
    long phone_No;
    String address;

    public void printInfo(){
        System.out.println(name);
        System.out.println(roll_No);
        System.out.println(phone_No);
        System.out.println(address);
    }


}
    /*Print the average of three numbers entered by user by creating a class named 'Average'
      having a method to calculate and print the average.*/

     class Average{

         public void printAverage(double a,double b,double c){
             double sum=a+b+c;
             double average=sum/3;
             System.out.println("Average is "+average);

         }
     }

public class Oops_Practise {
    public static void main(String[] args) {
        Employees emps1=new Employees();
        int salary=emps1.getSalary();
        System.out.println(salary);
        String name=emps1.getName();
        System.out.println(name);

        Cellphone cp1=new Cellphone();
        cp1.ring();
        cp1.vibrate();

        cp1.color="black";
        cp1.price=15000;
        cp1.getInfo();

        Square sq=new Square();
        sq.checkArea(5);
        sq.printperimeter(5);

        Rectangle rc=new Rectangle();
        rc.printarea(4,5);
        rc.printPerimeter(4,5);

        Tommy to=new Tommy();
        to.hit();
        to.run();
        to.fire();

        Circle cl=new Circle();
        cl.checkCircumference(4.0,3.14);
        cl.checkArea(4.0,3.14);

        Triangles tr=new Triangles();
        tr.printArea(3,4);

        tr.printPerimeter(3,4,5);

        Students st1=new Students();
        st1.name="Sam";
        st1.roll_No=30;
        st1.phone_No=8796543215l;
        st1.address="New Delhi";
        st1.printInfo();

        Students st2=new Students();
        st2.name="John";
        st2.roll_No=15;
        st2.phone_No=6325149864l;
        st2.address="Mumbai";
        st2.printInfo();

        Average avg=new Average();
        avg.printAverage(2,3,4);




    }
}
