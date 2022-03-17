package classobject_14_3_2022.class_object_14_3_2022;

class School{
    String name;
    String type;
    int age;

    //Functions or Methods or members
    //teach
    public void teach(){
        System.out.println("School teaches you");
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void getType(){
        System.out.println(this.type);
    }
    public void getAge(){
        System.out.println(this.age);
    }
    //groom
    public void groom(){
        System.out.println("School grooms you");
    }
}
class Sports{
    String name;
    String type;
    int age;

    //builds
    public void build(){
        System.out.println("Sports builds you");
    }
    //strengthens
    public void strengthen(){
        System.out.println("Sports strengthens you");
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void getType(){
        System.out.println(this.type);
    }
    public void getAge(){
        System.out.println(this.age);
    }
}

class Book{
    String name;
    String author;
    int pages;

    public void read(){
        System.out.println("We read books");
    }

    public void learn(){
        System.out.println("We learn from books");
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void getAuthor(){
        System.out.println(this.author);
    }
    public void getPages(){
        System.out.println(this.pages);
    }
}

public class Oops_Methods_Manoj {
    public static void main(String[] args) {
        School s1=new School();
        s1.name="DAV";
        s1.type="Co-Ed";
        s1.age=85;
        s1.teach();
        s1.getName();
        s1.getType();
        s1.getAge();
        s1.groom();

        Sports g1=new Sports();
        g1.build();
        g1.strengthen();
        g1.name="MSD";
        g1.type="Cricket";
        g1.age=40;
        g1.getName();
        g1.getType();
        g1.getAge();

        Book b1=new Book();
        b1.read();
        b1.learn();
        b1.name="Godan";
        b1.author="PremChand";
        b1.pages=60;
        b1.getName();
        b1.getAuthor();
        b1.getPages();

        Book b2=new Book();
        b2.name="Can't Hurt Me";
        b2.author="David Goggins";
        b2.pages=340;
        b2.getName();
        b2.getAuthor();
        b2.getPages();

        Book b3=new Book();
        b3.name="Ramayan";
        b3.author="tulsidas";
        b3.pages=1006;
        b3.getName();
        b3.getAuthor();
        b3.getPages();


    }
}
