package method_and_object;

public class Calculator1 {
    //addition
    public void addition(){
        int a=5;
        int b=5;
        int sum=a+b;
        System.out.println("addition is "+sum);
    }
    //subtraction
    public void subtraction(){
        int a=5;
        int b=4;
        int minus=a-b;
        System.out.println("subtraction is "+minus);
    }
    //multiply
    public void multiply(){
        int a=4;
        int b=5;
        int multiply=a*b;
        System.out.println("multiply is "+multiply);
    }
    //division
    public void division(){
        int a=8;
        int b=4;
        int division=a/b;
        System.out.println("division is "+division);
    }

    public static void main(String[] args) {
        Calculator1 obj=new Calculator1();
        obj.addition();
        obj.subtraction();
        obj.multiply();
        obj.division();
    }
}
