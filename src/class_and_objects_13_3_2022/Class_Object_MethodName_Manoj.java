package class_and_objects_13_3_2022;

class Animal{
    //data member
    String breed;
    int weight;

    //capabilities
    //hunt
    public void hunt(){
        System.out.println("This is hunt method.");
    }

    //run
    public void run(){
        System.out.println("This is run method.");
    }
    //eat
    public void eat(){
        System.out.println("This is eat method.");
    }
}
class Book{
    //data member
    String name;
    int pages;
    String author;

    //capabilities

    //read
    public void read(){
        System.out.println("This is read method");
    }
    //write
    public  void write(){
        System.out.println("This is write method");
    }
}

class Mobile{
    //data member
    String moileName;
    int price;

    //capabilities
    //call
    public void call(){
        System.out.println("This is call method");
    }
    //playMusic
    public void playMusic(){
        System.out.println("This is playMusic method");
    }

    //watchMovies
    public void watchMovies(){
        System.out.println("This is watchMovies");
    }
}

public class Class_Object_MethodName_Manoj {
    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.hunt();
        obj.run();
        obj.eat();

        Book obj1=new Book();
        obj1.read();
        obj1.write();

        Mobile ring=new Mobile();
        ring.call();
        ring.playMusic();
        ring.watchMovies();

    }
}
