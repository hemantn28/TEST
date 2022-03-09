package returntype;

public class CalcWithReturnType {
    public int addition(int a, int b){
        int addition=a+b;
        return addition;
    }
    public int subtraction(int a,int b){
        int subtraction=a-b;
        return subtraction;
    }
    public int multiply(int a, int b){
        int multiply=a*b;
        return multiply;
    }
    public int division(int a, int b){
        int division=a/b;
        return division;
    }

    public static void main(String[] args) {
        CalcWithReturnType obj=new CalcWithReturnType();
        int addition=obj.addition(3,6);
        System.out.println("addition is "+addition);
        int subtraction=obj.subtraction(5,2);
        System.out.println("subtraction is "+subtraction);
        int multiply=obj.multiply(4,5);
        System.out.println("multiply is "+multiply);
        int division=obj.division(6,3);
        System.out.println("division is "+division);


    }
}
