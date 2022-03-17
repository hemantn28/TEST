package Parameterized_Const_16_3_2022;

public class ReturnType {
    public String name(){
        String test="Vikas";
        return test;
    }
    public double getSalary(){
        double salary=85362.50;
        return salary;
    }
    public int checkAge(){
        int age=23;
        return age;
    }
    public int makeSquare(int num){
        int square=num*num;
        return square;
    }
    public String printName(){
        String name="Rashmi";
        return name;
    }

    public String printCity(){
        String city="Agra";
        return city;
    }
    public String printCompany(){
        String company="Adobe";
        return company;
    }
    public int printMarks(){
        int marks=89;
        return marks;
    }
    public double printheight(){
        double height=6.1;
        return height;
    }
    public double printspeed(){
        double speed=89.50;
        return speed;
    }

    public static void main(String[] args) {
        ReturnType rt=new ReturnType();
        String test=rt.name();
        System.out.println(test);

        double salary=rt.getSalary();
        System.out.println(salary);

        int age=rt.checkAge();
        System.out.println(age);

        int square=rt.makeSquare(15);
        System.out.println(square);

        String city=rt.printCity();
        System.out.println(city);

        String name=rt.printName();
        System.out.println(name);

        String company= rt.printCompany();
        System.out.println(company);

        int marks=rt.printMarks();
        System.out.println(marks);

        double height=rt.printheight();
        System.out.println(height);

        double speed=rt.printspeed();
        System.out.println(speed);


    }
}
