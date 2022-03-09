package class_and_object;

public class Student {
    //data member
    String name;
    int age;
    String section;

    //paremeterized constructor

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    public static void main(String[] args) {
        Student obj=new Student("ankit",23,"IT");
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.section);
    }
}
