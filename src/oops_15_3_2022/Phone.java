package oops_15_3_2022;

public class Phone {
    //Create a class with methods to print "ringing...", " vibrating..." etc.

    public void ringing(){
        System.out.println("Mobile is ringing...");
    }
    public void vibrating(){
        System.out.println("Mobile is vibrating...");
    }

    public static void main(String[] args) {
        Phone ph1=new Phone();
        ph1.ringing();
        ph1.vibrating();

    }

}
