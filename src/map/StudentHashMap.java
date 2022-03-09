package map;

import model.Student;

import java.util.HashMap;

public class StudentHashMap {
    public static void main(String[] args) {
        //syntax:CollectionName<datatype_key,datatype_value> ObjName=new CollectionName();
        HashMap<Integer, Student> studentHashmap=new HashMap<>();

        //create object of student of student model class
        Student student1=new Student("Sahni",47,"A");
        Student student2=new Student("Harshit",25,"C");
        Student student3=new Student("Yash",56,"B");

        //ADD
        studentHashmap.put(1,student1);
        studentHashmap.put(2,student2);
        studentHashmap.put(3,student3);

        for (Integer var: studentHashmap.keySet()){
            System.out.println(studentHashmap.get(var).getName());
            System.out.println(studentHashmap.get(var).getRollNo());
            System.out.println(studentHashmap.get(var).getSection());
        }
    }
}
