package scanner;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("plz enter ur name");
       String name= sc.nextLine();
        System.out.println("u have neterd ur name as "+name);

        System.out.println("plz enter ur age");
        int age=sc.nextInt();
        System.out.println("u have entered ur age as "+age);

        System.out.println("plx enter ur salary");
        double salary=sc.nextDouble();
        System.out.println("u have entered ur salary as "+salary);
    }

}
