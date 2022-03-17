package online_exercise_15_3_2022;

public class Student {
   /* Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2'
    and that of name as "John" by creating an object of the class Student.*/
    String name;
    int roll_no;
    String address;

    public void print_info(){
        System.out.println(this.name);
        System.out.println(this.roll_no);
        System.out.println(this.address);
    }

    /*Assign and print the roll number, phone number and address of two students having names
     "Sam" and "John" respectively by creating two objects of class 'Student'.*/


    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="John";
        s1.roll_no=2;
        s1.address="Agra";
        s1.print_info();

        Student s2=new Student();
        s2.name="Shyam";
        s2.roll_no=40;
        s2.address="Mathura";
        s2.print_info();

        Student s3=new Student();
        s3.name="Rashid";
        s3.roll_no=35;
        s3.address="Aligarh";
        s3.print_info();

        Student s4=new Student();
        s4.name="Aamna Sharif";
        s4.roll_no=1;
        s4.address="Mumbai";
        s4.print_info();

        Student s5=new Student();
        s5.name="Balram";
        s5.roll_no=5;
        s5.address="Tundla";
        s5.print_info();

        Student s6=new Student();
        s5.name="Sam";
        s5.roll_no=46;
        s5.address="New delhi";
        s5.print_info();

    }
}
