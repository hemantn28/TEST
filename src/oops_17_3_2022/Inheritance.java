package oops_17_3_2022;

class Shape{
    String color;
    int size;

    public void name(){
        System.out.println("My name is shape");
    }
}

class Triangle extends Shape{
    int length;

    public void reuse(){
        System.out.println("This is reuse method");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Triangle tr=new Triangle();
        tr.color="Blue";
        tr.size=4;
        System.out.println(tr.color);
        System.out.println(tr.size);
        tr.name();

        Shape sh=new Shape();

    }
}
