package oops_15_3_2022;

public class Rectangle {
    //Create a class Rectangle with a method to initialize its side ,calculating area, perimeter etc.
    int length;
    int breadth;

    public int area(int length, int breadth){
        int area=length*breadth;
        return area;

    }
    public int perimeter(int length, int breadth){
        int perimeter=2*(length + breadth);
        return perimeter;

    }

    public static void main(String[] args) {
        Rectangle rc=new Rectangle();
        int area=rc.area(6,8);
        int perimeter=rc.perimeter(6,8);
        System.out.println("Area is "+area);
        System.out.println("Perimeter is "+perimeter);
    }
}
