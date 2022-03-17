package classobject_14_3_2022.class_object_14_3_2022;

class Student{
    //data
    String name;
    int age;
    String section;

    //Member or Methods or Functions

    //study
    public void study(){
        System.out.println("We r studying");
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void getAge(){
        System.out.println(this.age);
    }
    public void getSection(){
        System.out.println(this.section);
    }

}

public class OOPS {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Mohit";
        s1.age=19;
        s1.section="CS";
        s1.study();
        s1.getName();
        s1.getAge();
        s1.getSection();

        Student s2=new Student();
        s2.name="Ramesh";
        s2.age=20;
        s2.section="IT";
        s2.study();
        s2.getName();
        s2.getAge();
        s2.getSection();

    }
}
