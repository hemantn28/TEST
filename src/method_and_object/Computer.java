package method_and_object;

public class Computer {
    //data member
    String name;
    int price;

    //capabilities
    //calculate
    public void calculate(){
        System.out.println("this is calculate method");
    }
    //playvideos
    public  void  playvideos(){
        System.out.println("this is playvideos method");
    }

    public static void main(String[] args) {
        Computer obj=new Computer();
        obj.calculate();
        obj.playvideos();
    }

}
