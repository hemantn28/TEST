package collections;

import model.Student;

import java.util.ArrayList;

public class ArrayListStudentH {
    public static void main(String[] args) {
        ArrayList<Student> s1=new ArrayList<>();

        //create object of student class
        Student student1=new Student("Sarthak",54,"IT");
        Student student2=new Student("Kohli",24,"ME");
        Student student3=new Student("Rajiv",44,"CS");

        s1.add(student1);
        s1.add(student2);
        s1.add(student3);

        for(Student var: s1){
            System.out.println(var.getName());
            System.out.println(var.getRollNo());
            System.out.println(var.getSection());

        }

    }
}
