package oops_15_3_2022;

public class Pupil {
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public static void main(String[] args) {


    Pupil pl1=new Pupil();
    pl1.name="Akash";
    pl1.age=12;
    pl1.printinfo();

    Pupil pl2=new Pupil();
    pl2.name="Kanta";
    pl2.age=26;
    pl2.printinfo();

    Pupil pl3=new Pupil();
    pl3.name="brijMohan";
    pl3.age=24;
    pl3.printinfo();

    Pupil pl4=new Pupil();
    pl4.name="Neha";
    pl4.age=21;
    pl4.printinfo();




    }
}
