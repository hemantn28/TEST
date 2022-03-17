package oops_15_3_2022;

public class Laptop {
    String brandName;
    String color;
    int price;

    //methods or functions or members
    //coding
    public void coding(){
        System.out.println("Laptop stores the codes");
    }
    //playMovies
    public void playMovies(){
        System.out.println("Laptop play movies");
    }
    public void getbrandname(){
        System.out.println(brandName);
    }

    public static void main(String[] args) {
        Laptop lp1=new Laptop();
        lp1.coding();
        lp1.playMovies();
        lp1.brandName="Apple";
        lp1.color="White";
        lp1.price=95000;
        lp1.getbrandname();
        System.out.println(lp1.color);
        System.out.println(lp1.price);
        Laptop lp2=new Laptop();
        lp2.brandName="Asus";
        lp2.color="red";
        lp2.price=85000;
        System.out.println(lp2.brandName);
        System.out.println(lp2.color);
        System.out.println(lp2.price);
    }
}
