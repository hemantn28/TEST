package scanner;

import java.util.Scanner;

public class ScannerwithCalcInput4 {
    public void addition(int a, int b){
        int addition =a+b;
        System.out.println("addition is "+addition);
    }
    public void subtraction(int a, int b){
        int subtraction =a-b;
        System.out.println("subtraction is "+subtraction);
    }
    public void multiply(int a, int b){
        int multiply =a*b;
        System.out.println("multiply is "+multiply);
    }
    public void division(int a, int b){
        int division =a/b;
        System.out.println("division is "+division);
    }

    public static void main(String[] args) {
        ScannerwithCalcInput4 obj=new ScannerwithCalcInput4();
        Scanner sc=new Scanner(System.in);
        System.out.println("welvome to calculator app plz enter ur choice " +
                           "1 for addition, 2 for subtraction, 3 for multiply, 4 for division");
        int choice=sc.nextInt();


        while(choice!=0){
            System.out.println("enter value of a");
            int a=sc.nextInt();
            System.out.println("enter value of b");
            int b=sc.nextInt();

            if (choice==1){
                obj.addition(a,b);

            }
            else if (choice==2){
                obj.subtraction(a,b);
            }
            else if(choice==3){
                obj.multiply(a,b);
            }
            else if(choice==4){
                obj.division(a,b);
            }
            System.out.println("enter 0 to exit from calculator");
            choice=sc.nextInt();

        }


    }
}
