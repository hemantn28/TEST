package oops_15_3_2022;

public class Square1 {
    int side;

    public void area(int side){
        int area=side*side;
        System.out.println("area is "+area);
    }
    public void perimeter(int side){
        int perimeter=4*side;
        System.out.println("perimeter is "+perimeter);
    }

    public static void main(String[] args) {
        Square1 sq1=new Square1();
        sq1.area(5);
        sq1.perimeter(5);
    }
}
