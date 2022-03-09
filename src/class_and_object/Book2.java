package class_and_object;

public class Book2 {
    //data member
    String name="Godan";
    int pages=60;
    String author="Premchand";

    public static void main(String[] args) {
        Book2 obj=new Book2();
        System.out.println(obj.name + obj.pages + obj.author);
    }
}
