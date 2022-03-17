package oops_15_3_2022;

public class Square {
      //Create a class Square with a method to initialize its side ,calculating area, perimeter etc.
    int side;

    public int area(int side){
        int area=side*side;
        return area;
    }
    public int perimeter(int side){
        int perimeter=4*side;
        return perimeter;
    }

    public static void main(String[] args) {
        Square sq=new Square();
        int area=sq.area(3);
        System.out.println("area is "+area);

        int perimeter=sq.perimeter(3);
        System.out.println("Perimeter is "+perimeter);

    }
}
