package scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plz enter ur school name");
        String school_name=sc.nextLine();
        System.out.println("u have entered ur school name as "+school_name);

        System.out.println("enter ur marks");
        int marks=sc.nextInt();
        System.out.println("u have entered ur marks as "+marks);

        System.out.println("enter ur bike_speed");
        double bike_speed=sc.nextDouble();
        System.out.println("u have entered ur bike_speed as "+bike_speed);
    }
}
