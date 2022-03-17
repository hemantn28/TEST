package classobject_14_3_2022.class_object_14_3_2022;

public class Mobile {
    //Data
    String name;
    int price;

    //member or methods or functions

    // call
    public  void call(String name){
        String var=name;
        System.out.println("call to anyone "+name);
    }
    //calculate
    public void calculate(String type){
        String var=type;
        System.out.println("Mobile can calculate operations "+type);
    }
    //price
    public void checkPrice(int price){
        if (price>20000){
        System.out.println("Mobile is costly");
        }
        else {
            System.out.println("Mobile is not costly");
        }
    }
    //make square
    public void makeSquare(int number){
        int result=number*number;
        System.out.println(result);
    }
    //make cube
    public void makeCube(int num){
        int result=num*num*num;
        System.out.println(result);
    }
    //Test
    public void test(String name, int age){
        System.out.println(name+" "+age);
    }



    public static void main(String[] args) {
        Mobile m1=new Mobile();
        m1.call("Rahul");
        m1.calculate("Smartphone");
        m1.checkPrice(50000);
        m1.makeSquare(5);
        m1.makeCube(3);
        m1.test("Ravi",23);
    }
}

