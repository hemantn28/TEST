package online_exercise_15_3_2022;

public class Triangle {
    /* Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named
       'Triangle' without any parameter in its constructor.*/


    //area
   /*public void getArea(double a,double b, double c){
        double area = (a+b+c)/2.0;
        System.out.println(area);
    }*/

   /* public void getperimeter(double a,double b, double c){
        double perimeter=a+b+c;
        System.out.println("Perimeter is "+perimeter);
    }*/

   /* public double getArea(double a,double b, double c){
        double area=(a+b+c)/2.0;
        return area;
    }*/

    public double getperimeter(double a,double b, double c){
        double perimeter=a+b+c;
        return perimeter;
    }

    public static void main(String[] args) {
        Triangle t=new Triangle();
       // t.getArea(2.0,4.0,6.0);

        //t.getperimeter(2.0,4.0,6.0);

        /*double area= t.getArea(2.0,4.0,6.0);
        System.out.println("area is "+area);*/

        double perimeter=t.getperimeter(2.0,4.0,6.0);
        System.out.println("Perimeter is "+perimeter);






    }
}
