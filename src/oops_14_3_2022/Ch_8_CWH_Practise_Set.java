package oops_14_3_2022;

class Engineer{
    /*Create a class Professional with following properties and methods.

    Salary(property)(int)
    getSalary(method returning int)
    name(propery)(String)
    getName(method returning String)
    setName(method changing name)
     */
    String name;
    int salary;

   /* public void getName(){
        System.out.println(this.name);
    }
    public void getSalary(){
        System.out.println(this.salary);
    }*/
    public String getName(){
        String name="Haneef";
        return name;
    }
    public int getSalary(){
        int salary=56000;
        return salary;
    }
}
//Create a class cellphone with methods to print "ringing..." , "vibrating..."  etc.

    class Cellphone{
    String color;
    int price;

    //ringing
        public void ringing(){
            System.out.println("Mobile is ringing");
        }
        //vibrating
        public void vibrating(){
            System.out.println("Mobile is vibrating");
        }
    }

    //Create a class square with a method to initialize its side, calculating area and perimeter etc.
    class Square{
    String name;

    }

public class Ch_8_CWH_Practise_Set {

    public static void main(String[] args) {
        Engineer e1=new Engineer();
       // e1.name="Ahmad";
        //e1.salary=58000;
       // e1.getName();
        //e1.getSalary();
        String name= e1.getName();
        System.out.println(name);

        int salary=e1.getSalary();
        System.out.println(salary);

        Cellphone cp1=new Cellphone();
        cp1.color="White";
        cp1.price=15000;
        cp1.ringing();
        cp1.vibrating();

    }
}
