package scanner;

import java.util.Scanner;

public class ScannerWithCalcinput2 {
    public void addition(int a, int b){
        int sum=a+b;
        System.out.println("addition is "+sum);
    }
    public void subtraction(int a, int b) {
        int subtraction = a - b;
        System.out.println("subtraction is " + subtraction);
    }
    public void multiply(int a, int b) {
        int multiply = a * b;
        System.out.println("multiply is " + multiply);
    }
    public void division(int a, int b) {
        int division = a / b;
        System.out.println("division is " + division);
    }

        public static void main(String[] args) {
        ScannerWithCalcinput2 obj=new ScannerWithCalcinput2();
        Scanner sc=new Scanner(System.in);
            System.out.println("Welcome to calculator app plz enter ur choice " +
                               "1 for addition, 2 for subtraction, 3 for multiply, 4 for division");
            int choice= sc.nextInt();

            while(choice!=0){
                System.out.println("enter value of a ");
                int a=sc.nextInt();
                System.out.println("enter value of b");
                int b=sc.nextInt();

                if (choice==1){
                    obj.addition(a,b);
                }
                else if (choice==2){
                    obj.subtraction(a,b);
                }
                else if (choice==3){
                    obj.multiply(a,b);
                }
                else if (choice==4){
                    obj.division(a,b);
                }
                System.out.println("Enter 0 to exit from calculator");
                choice= sc.nextInt();
            }


    }
}
