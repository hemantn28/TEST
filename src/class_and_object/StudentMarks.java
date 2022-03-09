package class_and_object;

public class StudentMarks {
    //data member
    String name;
    int marks;
    int standard;

    //parameterized constructor

    public StudentMarks(String name, int marks, int standard) {
        this.name = name;
        this.marks = marks;
        this.standard = standard;
    }

    public static void main(String[] args) {
        StudentMarks obj=new StudentMarks("Ankur",85,8);
        System.out.println(obj.name);
        System.out.println(obj.marks);
        System.out.println(obj.standard);

        StudentMarks obj2=new StudentMarks("Deepak",90,9);
        System.out.println(obj2.name);
        System.out.println(obj2.marks);
        System.out.println(obj2.standard);

    }
}
