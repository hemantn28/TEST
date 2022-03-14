package class_and_objects_13_3_2022;

class Student{
    String name;
    int age;
    String section;

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }
}

public class Class_Object2 {
    public static void main(String[] args) {
        Student study=new Student("Kishan",21,"CS");
        System.out.println(study.name+ " " +study.age+ " " +study.section);

        Student obj=new Student("Himanshi",20,"IT");
        System.out.println(obj.name+" "+obj.age+ " "+obj.section);

        Student read=new Student("Varun",22,"ME");
        System.out.println(read.name+" "+read.age+" "+read.section);

        Student write=new Student("Prateek",18,"CE");
        System.out.println(write.name+" "+write.age+" "+write.section);

    }
}
