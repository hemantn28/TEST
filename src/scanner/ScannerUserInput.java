package scanner;

import java.util.Scanner;

public class ScannerUserInput {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
       // System.out.println("It works");
        Scanner sc=new Scanner(System.in);
       /* System.out.println("enter num 1");
        int a=sc.nextInt();
        System.out.println("enter num 2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum of these numbers is "+sum);*/

       // System.out.println(sc.hasNextInt());

        String str=sc.next();
        System.out.println(str);

    }
}
