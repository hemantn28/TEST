package scanner;

import java.util.Scanner;

public class DemoScanner2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter ur naem");
        String name=sc.nextLine();
        System.out.println("u have entered ur name as "+name);

        System.out.println("eneter ur age");
        int age=sc.nextInt();
        System.out.println("u have entered ur gae as "+age);

        System.out.println("enter ur salary");
        double salary=sc.nextDouble();
        System.out.println("u have entered ur salary as "+salary);
    }

}
