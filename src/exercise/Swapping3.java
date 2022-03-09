package exercise;

import java.util.Scanner;

public class Swapping3 {
    public static void main(String[] args) {

        /* x=100;
           y=50;
           swapping logic:
           x=x+y;
           y=x-y;
           x=x-y
           */
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of a: ");
        int x=sc.nextInt();
        System.out.print("enter value of b: ");
        int y=sc.nextInt();

        System.out.println("before swapping numbers are: "+x+" "+y);
        //swapping

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swapping numbers are: "+x+" "+y);

    }
}
