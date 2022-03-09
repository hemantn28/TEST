package method_and_object;

public class Person {
    //data member
    String name;
    int age;

    //capabilities
    //eat
    public void eat(){
        System.out.println("this is eat method");
    }
    //walk
    public void walk(){
        System.out.println("this is walk method");
    }

    public static void main(String[] args) {
        Person obj=new Person();
        obj.eat();
        obj.walk();
    }
}
