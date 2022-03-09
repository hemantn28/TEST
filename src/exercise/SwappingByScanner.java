package exercise;

import java.util.Scanner;

public class SwappingByScanner {

     /* x=5(first num) y=3(second num)
         swapping logic:
         x=x+y=5+3=8;
         y=x-y=8-3=5;
         x=x-y=8-5=3
         numbers are swapped as x=3 and y=5;
         */
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.print("enter value of x: ");
         int x= sc.nextInt();

         System.out.print("enter value of y: ");
         int y=sc.nextInt();

         System.out.println("before swapping numbers: "+x+" "+y);
         //swapping
         x=x+y;
         y=x-y;
         x=x-y;
         System.out.println("after swapping: "+x+" "+y);


     }

}
