package exercise;

import java.util.Scanner;

public class Ch_4_Operators_Practice_Set {
    public static void main(String[] args) {
        /*Q.1. What will be the output of the following programme:
        int a=10;
        if(a=11){
        System.out.println("I am 11");
        }
        else{
           System.out.println("I am not 11";)
        }
         */

        /*int a=19;
        if (a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }*/
        /* Q.2. Write a programme to find whether a student is pass or fail.If it requires total 40% and at least 33% in each subject to pass.
        Assume 3 subjects and take marks as an input from the user. */

       /* int m1,m2,m3;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        m1=sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        m2=sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        m3=sc.nextInt();

        double avg=(m1+m2+m3)/3.0;
        System.out.println("Your overall percentage is: "+avg);
        if (avg>=40 && m1>=33 && m2>=33  && m3>=33){
            System.out.println("Congrats,You have been passed.");
        }
        else{
            System.out.println("Sorry, You have been failed.");
        }*/
        /*Q.3.Calculate income tax paid by an employee to the govt. as per the slabs mentioned below:
                          INCOME SLAB     TAX
                          2.5L-5.0L       5%
                          5.0L-10.0L      20%
                          Above 10.0L     30%
        Note: There is no tax below 2.5L . Take input amount as an input from the user. */
       /* Scanner sc=new Scanner(System.in);
        System.out.print("Enter ur income in lacs per annum: ");
        double tax=0;
        double income= sc.nextDouble();
        if (income<2.5){
            tax= tax+0;
        }
        else if (income>2.5 && income<5.0){
            tax=tax+ .005 * (income-2.5);
        }
        else if (income>5.0 && income<10.0){
            tax= tax +0.05 * (5.0 - 2.5);
            tax= tax +0.2 * (income - 5.0);
        }
        else if (income>=10.0){
            tax= tax +0.05 * (5.0 - 2.5);
            tax= tax +0.2 * (income - 5.0);
            tax= tax +0.3 * (income - 10.0);
        }
        System.out.println("The total tax paid by the employee is: "+tax);*/
        /*.Q.4.Write a java programme to find out the day of the week.Given the number [1 for monday, 2 for tuesday...so on.] */

        /* Q.5.Write a java programme to find whether a year entered by the user is leap year or not.*/

        //if a year is multiple of 400, then it is a leap year.

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = sc.nextInt();
        boolean flag = false;
        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        if (flag) {
            System.out.println("Year " + year + " is a Leap Year");
        }*/
        /* Q.6.Write a java programme to find out the type of website from the url.*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the website name");
        String website= sc.next();

        if (website.endsWith(".org")){
            System.out.println("It is an organisation website");
        }
        else if (website.endsWith(".com")){
            System.out.println("It is a commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("it is an indian website");
        }
    }
}






