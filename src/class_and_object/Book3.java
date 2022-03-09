package class_and_object;

public class Book3 {
    //data member
    String name="Can't hurt me";
    int pages=390;
    String author="David Goggins";

    public static void main(String[] args) {
        Book3 obj=new Book3();
        System.out.println(obj.name);
        System.out.println(obj.pages);
        System.out.println(obj.author);


    }
}
