package oops_15_3_2022;

public class Rectangle1 {
    //Create a class Rectangle with a method to initialize its side ,calculating area, perimeter etc.
    int side;

    public void area(int length, int breadth){
        int area=length*breadth;
        System.out.println("Area is "+area);
    }
    public void perimeter(int length, int breadth){
        int perimeter=2*(length + breadth);
        System.out.println("Perimeter is "+perimeter);
    }

    public static void main(String[] args) {
        Rectangle1 rc1=new Rectangle1();
        rc1.area(4,5);
        rc1.perimeter(4,5);
    }

}
