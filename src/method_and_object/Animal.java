package method_and_object;

public class Animal {
    //data member
    String breed;
    int weight;

    //syntax: access_specifier return_type method_name(parameter){CODE}
    //capabilities
    //eat
    public void eat(){
        System.out.println("this is eat method");
    }
    //run
    public void run(){
        System.out.println("this is run method");
    }
    //hunt
    public void hunt(){
        System.out.println("this is hunt method");
    }

    public static void main(String[] args) {
    Animal obj=new Animal();
    obj.eat();
    obj.run();
    obj.hunt();
    }

}
