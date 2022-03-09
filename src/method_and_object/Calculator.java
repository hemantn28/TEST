package method_and_object;

public class Calculator {
    //addition
    //syntax:access specifier return type method name(){CODE}
    public void addition(){
        int a=10;
        int b=5;
        int sum=a+b;
        System.out.println("addition is "+sum);
    }
    //subtraction
    public void subtraction(){
        int a=55;
        int b=45;
        int subtraction=a-b;
        System.out.println("subtraction is "+subtraction);
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
        int a=6;
        int b=3;
        int division=a/b;
        System.out.println("division is "+division);
    }

    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.addition();
        obj.subtraction();
        obj.multiply();
        obj.division();
    }

}
