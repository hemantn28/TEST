package oops_15_3_2022;

public class Student {
    String name;
    String section;
    int age;

    public Student(String name, String section, int age) {
        this.name = name;
        this.section = section;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1=new Student("Rakesh","CS",21);
        System.out.println(s1.name+" "+s1.section+" "+s1.age);

        Student s2=new Student("Vijay","ME",20);
        System.out.println(s2.name+" "+s2.section+" "+s2.age);

        Student s3=new Student("Sameer","Civil",21);
        System.out.println(s3.name+" "+s3.section+" "+s3.age);

        Student s4=new Student("Tilak","Electical",19);
        System.out.println(s4.name+" "+s4.section+" "+s4.age);
    }
}
