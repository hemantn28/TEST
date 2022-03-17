package oops_14_3_2022;

class Worker{
    String name;
    int id;

    //methods or functions or members
    //work
    public void work(){
        System.out.println("You work in office");
    }
    public void getinfo(){
        System.out.println(name);
        System.out.println(id);
    }

}
public class Custom_Class {
    public static void main(String[] args) {
        Worker w1=new Worker();
        w1.name="Shounak";
        w1.id=17400;
        w1.getinfo();
        w1.work();

        Worker w2=new Worker();
        w2.name="Shyam";
        w2.id=1515786;
        w2.getinfo();

    }
}
