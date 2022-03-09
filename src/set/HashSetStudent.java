package set;

import model.Student;

import java.util.HashSet;

public class HashSetStudent {

    public void createhashSet(){
        //syntax: CollectionName <Datatype> ObjName=new CollectionName();

        HashSet<Student> myHashSet=new HashSet<>();

        Student student1=new Student("Shivam",45,"CS");
        System.out.println(student1.hashCode());
        Student student2=new Student("Mohit",25,"IT");
        System.out.println(student2.hashCode());
        Student student3=new Student("Mohit",25,"IT");
        Student student4=new Student("Mukesh",25,"IT");
        System.out.println(student3.hashCode());

        myHashSet.add(student1);
        myHashSet.add(student2);
        myHashSet.add(student3);

        for (Student var: myHashSet){
            System.out.println(var.getName() + " Hashcode "+var.hashCode());
        }
    }

    public static void main(String[] args) {
        HashSetStudent obj=new HashSetStudent();
        obj.createhashSet();
    }
}
