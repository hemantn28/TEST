package oops_15_3_2022;

public class Book {
    String name;
    String author;
    int pages;
    int price;

    public static void main(String[] args) {
        Book b1=new Book();
        b1.name="Java";
        b1.author="James Gosling";
        b1.pages=340;
        b1.price=250;
        System.out.println(b1.name);
        System.out.println(b1.pages);
        System.out.println(b1.author);
        System.out.println(b1.price);
    }
}
