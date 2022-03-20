package inheritance_18_3_2022;

class Bicycle{
    String name;
    int price;

    public void driveBicycle(){
        System.out.println("You drive bicycle");
    }
}
class Atlas extends Bicycle{
    int speed;

}

public class Inheritance {
    public static void main(String[] args) {
        Atlas atl=new Atlas();
        atl.driveBicycle();
        atl.name="Atlas";
        System.out.println(atl.name);

    }
}
