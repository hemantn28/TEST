package exercise;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {

        /*1.Swap two numbers without using third variable.

        int x=10;
        int y=5;

         x=x+y;
         y=x-y;
         x=x-y;
        System.out.println("After swapping: "+ " x= "+ x +", y = "+ y);
        }*/

        /* let x=6, y=2;
        swapping logic
        x=x+y; 6+2=8;
        y=x-y; 8-2=6;
        x=x-y; 8-6=2;
        numbers are swapped as x=2 ,y=6;
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of x: ");
        int x = sc.nextInt();
        System.out.print("enter value of y: ");
        int y = sc.nextInt();

        System.out.println("before swapping numbers are: " + x + " " + y);

        //swapping
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("after swapping numbers are: " + x + " " + y);


    }

}