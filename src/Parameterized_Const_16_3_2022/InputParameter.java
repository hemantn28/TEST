package Parameterized_Const_16_3_2022;

public class InputParameter {

    public void name(String name){
        String var=name;
        System.out.println("Your name is: "+var);

    }

    public void makesquare(int num){
        int result=num*num;
        System.out.println("result is "+result);
    }
    public void checkAge(int age){
        if (age>18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("not eligible");
        }
    }

    public void checkInfo(String name,int age){

        System.out.println("name is "+name);
        System.out.println("age is "+age);
    }
    public void printStat(String name,int age,double salary){

        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your salary is "+salary);

    }

    public static void main(String[] args) {
        InputParameter ip=new InputParameter();
        ip.name("ravi");
        ip.makesquare(12);
        ip.checkAge(20);
        ip.checkInfo("Shivam",19);
        ip.printStat("Nitin",24,78654.52);
    }
}
