package class_and_object;

public class Book {
    //data member
    String name="Java";
    int pages=340;
    String author="James Gosling";

    public static void main(String[] args) {
        Book obj=new Book();
        System.out.println(obj.name + obj.pages + obj.author);

    }
}
