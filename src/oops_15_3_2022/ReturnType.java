package oops_15_3_2022;

public class ReturnType {

    public String name(){

        String name="java";
        return name;
    }
    public int ckeckAge(){
        int age=23;
        return age;
    }
    public double checkSalary(){
        double salary=85000.50;
        return salary;
    }
    public int makeSquare(int num){
        int result=num*num;
        return result;
    }
    public int makrCube(int num){
        int cube=num*num*num;
        return cube;
    }
    public int getMarks(){
        int marks=85;
        return marks;
    }

    public static void main(String[] args) {
        ReturnType obj=new ReturnType();
        String name=obj.name();
        System.out.println("Your name is "+name);
        int age=obj.ckeckAge();
        System.out.println("Your age is "+age);
        double salary=obj.checkSalary();
        System.out.println("Your salary is "+salary);
        int result=obj.makeSquare(5);
        System.out.println("Square is "+result);
        int cube=obj.makrCube(3);
        System.out.println("Cube is "+cube);
        int marks=obj.getMarks();
        System.out.println("Your marks are "+marks);
    }
}
