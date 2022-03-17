package oops_15_3_2022;

public class TommyVecetti {
    //Create a class Tommy Vecetti for Rockstar games capable of hitting(print hitting), running and firing etc.

    public void hit(){
        System.out.println("hitting the target");
    }
    public void run(){
        System.out.println("running behind the target");
    }
    public void fire(){
        System.out.println("firing the target");
    }


    public static void main(String[] args) {
        TommyVecetti tv=new TommyVecetti();
        tv.hit();
        tv.run();
        tv.fire();

    }
}
