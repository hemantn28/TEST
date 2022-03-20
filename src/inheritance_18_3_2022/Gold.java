package inheritance_18_3_2022;

class Jewellery{
    String name;
    int price;

    public void make(){
        System.out.println("make jewellery from jewellery showroom");
    }
}
class Necklace extends Jewellery{
    int age;
}

public class Gold {
    public static void main(String[] args) {
        Necklace nl=new Necklace();
        nl.name="Chain";
        System.out.println(nl.name);
        nl.price=50000;
        System.out.println(nl.price);
        nl.make();
    }
}
