package oops_14_3_2022;

public class Individual_Methods {
    //data
    String name;
    int age;
    String profession;

    //Members or Functions or Methods
    //walk
    public void walk(){
        System.out.println("You can walk");
    }
    //run
    public void run(){
        System.out.println("You can run");
    }
    public void getname(){
        System.out.println(this.name);
    }
    public void getage(){
        System.out.println(this.age);
    }
    public void getprofession(){
        System.out.println(this.profession);
    }

    public static void main(String[] args) {
        Individual_Methods i1=new Individual_Methods();
        i1.walk();
        i1.run();
        i1.name="Sukhdev";
        i1.age=27;
        i1.profession="Doctor";
        i1.getname();
        i1.getage();
        i1.getprofession();

    }


}
