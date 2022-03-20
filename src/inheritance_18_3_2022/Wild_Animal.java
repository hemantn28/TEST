package inheritance_18_3_2022;

class Car{
    String name;
    int price;

    public void drive(){
        System.out.println("Car drives fast");
    }
}
class Maruti extends Car{
    int speed;
}

public class Wild_Animal {
    /*String name;
    int weight;

    public void kill(){
        System.out.println("It can kill");
    }

    class Leopard extends Wild_Animal{
        int age;
    }*/

    public static void main(String[] args) {
       /* Wild_Animal wa=new Wild_Animal();
        wa.kill();
        wa.name="Raja";
        System.out.println(wa.name);*/

        Maruti m=new Maruti();
        m.drive();
        m.price=4503624;
        System.out.println(m.price);





    }





}
