package class_and_object;

public class Book4 {
    String name;
    int pages;
    String author;

    //parameterized constructor


    public Book4(String name, int pages, String author) {
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    public static void main(String[] args) {
         //Classname objname = new Classname(value1,value2,value3....):
        Book4 obj=new Book4("Swami Vivekanand", 410,"Narendra Kohli");
        System.out.println(obj.name);
        System.out.println(obj.pages);
        System.out.println(obj.author);
        Book4 obj2=new Book4("ABC",55,"zxy");
        System.out.println(obj2.name + obj2.pages + obj2.author);

    }
}
