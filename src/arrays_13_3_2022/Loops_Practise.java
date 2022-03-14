package arrays_13_3_2022;

import java.util.Scanner;

public class Loops_Practise {
    public static void main(String[] args) {
       /*int i=0;
        while (i<=5){
            System.out.println("Hello "+i);
            i++;
        }*/

       /* int i=5;
        while (i>=0){
            System.out.println("Hello "+i);
            i--;
        }*/
        // Write a programme to print natural numbers from 100 to 200.
        /*int i=100;
        while (i<=200){
            System.out.println(i);
            i++;
        }*/
        // Write a programme to print natural numbers from 10 to 20.
        /*int i=10;
        while (i<=20){
            System.out.println(i);
            i++;
        }*/
        // Write a programme to print natural numbers from 20 to 10 in reverse order.

       /* int i=20;
        while (i>=10){
            System.out.println(i);
            i--;
        }*/
        // Write a programme to print natural numbers from 10 to 20 using do-while loop.

       /* int i=10;
        do {
            System.out.println(i);
            i++;
        }while (i<=20);*/

        // Write a programme to print natural numbers from 20 to 10 in reverse order using do-while loop.

        /*int i=20;
       do {
           System.out.println(i);
           i--;
       }while(i>=10);*/
       /* while (true){
            System.out.println("I am an infinite loop");
        }*/

      /*  do {
            System.out.println("I am an infinite loop");
        }while (true);*/

        //WRITE A JAVA PROGRAMME TO PRINT FIRST N NATURAL NUMBERS USING  WHILE LOOP.

       /* int i=1;
        while (i<=5){
            System.out.println(i);
            i++;
        }*/
        // Write a programme to print natural numbers from 100 to 200 using for loop.

        /*for (int i=100; i<=200; i++){
            System.out.println(i);
        }*/
        //WRITE A JAVA PROGRAMME TO PRINT FIRST N NATURAL NUMBERS USING  FOR LOOP.

        /*for (int i=1; i<=9; i++){
            System.out.println(i);
        }*/
        //Write the table of any number using all loops.

        /*int n=2;
        for (int i=1; i<=10; i++){
            int result=n*i;
            System.out.println(result);
        }*/
        /*int n=7;
        int i=1;
        while (i<=10){
            int result=n*i;
            i++;
            System.out.println(result);
        }*/

        /*int n=12;
        int i=1;

        do { int result=n*i;
            System.out.println(result);
            i++;
        }while (i<=10);*/

        //write a programme to print first n odd numbers using all loops.

        //using for loop.

        /*for (int i=0; i<5; i++){
            System.out.println(2*i+1);
        }*/
        //using while loop.

       /* int i=0;
        while(i<5){
            System.out.println(2*i+1);
            i++;
        }*/

        //using do-while loop.
        /*int i=0;
        do {
            System.out.println(2*i+1);
            i++;
        }while(i<5);*/
        //print hello 5 times using all loops.
       /* int i=1;
        while (i<=5){
            System.out.println("Hello "+i);
            i++;
        }*/
        //Using do-while loop
        /*int i=1;
        do {
            System.out.println("hello "+i);
            i++;
        }while (i<=5);*/

        //using for loop.

        /*for (int i=1; i<=5; i++){
            System.out.println("Hello "+i);
        }*/
        //print hello 5 times in reverse order using all loops.
       /* for (int i=5; i>=0; i--){
            System.out.println("Hello "+i);
        }*/

        /*int i=5;
        while (i>0){
            System.out.println("Hello "+i);
            i--;
        }*/

        //using do-while loop.
        /*int i=5;
        do {
            System.out.println("Hello "+i);
            i--;
        }while (i>=0);*/

       /* int age;
        System.out.println("Enter ur age: ");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();

        switch(age){
            case 19:
                System.out.println("U r an adult now.");
                break;
            case 23:
                System.out.println("U got a job now.");
                break;
            case 27:
                System.out.println("U got promotion now.");
                break;
            case 60:
                System.out.println("U r retired now.");
                break;
            default:
                System.out.println("Enjoy ur life.");
        }*/
       /* int marks;
        System.out.print("Enter ur marks:");
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();

        switch (marks){
            case 95:
                System.out.print("U r extraordinary");
                break;
            case 80:
                System.out.print("U r brilliant");
                break;
            case 70:
                System.out.print("U gor decent marks");
                break;
            case 60:
                System.out.print("U r good");
                break;
            case 50:
                System.out.print("U just passed");
                break;
            default:
                System.out.print("Enjoy");
        }*/

        //Write a programme to print the following pattern.
        //    * * * *
        //    * * *
        //    * *
        //     *
       /* int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
        }
        System.out.print("\n");*/

        /*int n=4;
        for (int i=n; i>0; i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }*/
         // Write a programme to sum first n even numbers using all loops.

        /*int i=1;
        System.out.println("Using while loop");
        while (i<=5){
            System.out.println(2*i);
            i++;
        }
        int j=1;
        System.out.println("Using Do-While loop");
        do {
            System.out.println(2*j);
            j++;
        }while (j<=5);

        System.out.println("Using for loop");
        for (int k=1; k<=5; i++){
            System.out.println(2*k);
            k++;
        }*/

        //Write a programme to print the multiplication of n number using all loops.

        /*int n=19;
        System.out.println("Table of 19 using for loop");
        for (int i=1; i<=10; i++){
            int result=n*i;
            System.out.println("Table of 19: "+result);
        }

        System.out.println("Table of 19 using while loop");
        int m=19;
        int j=1;
        while (j<=10){
            int result=m*j;
            System.out.println("Table of 19: "+result);
            j++;
        }

        System.out.println("Table of 19 using do-while loop");
        int l=19;
        int a=1;
        do {
            int result=l*a;
            System.out.println("Table of 19: "+result);
            a++;
        }while (a<=10);*/

        //Table of 7 using do-while loop

        /*int n=7;
        int i=1;
        System.out.println("Table of 7 using do-while loop");
        do {
            int result=n*i;
            System.out.println("Table of 7: "+result);
            i++;
        }while (i<=10);*/

        //Table of 8 using while loop

        /*int n=8;
        int i=1;
        while (i<=10){
            int result=n*i;
            System.out.println("Table of 8: "+result);
            i++;
        }*/
        //table of 9 using for loop

        /*int n=9;
        for (int i=1; i<11; i++){
            int result=n*i;
            System.out.println("Table of 9: "+result);
        }*/

        //Print table of 12 in reverse order using all loops.

        /*System.out.println("Table of 12 in reverse order using for loop");
        int n=12;
        for (int i=10; i>0; i--){
            int result=n*i;
            System.out.println("Table of 12 in reverse order: "+result);
        }*/

        /*System.out.println("Table of 12 in reverse order using while loop");
        int n=12;
        int i=10;
        while (i>0){
            int result=n*i;
            System.out.println("Table of 12 in reverse order: "+result);
            i--;
        }*/

       /* System.out.println("Table of 17 using do-while loop in reverse order");
        int n=17;
        int i=10;
        do {
            int result=n*i;
            System.out.println("Table of 17 in reverse order: "+result);
            i--;
        }while (i>0);*/

        //Write a programme to find the factorial of 4 using all loops.

        // factorial 4= 4*3*2*1=24.

       /* System.out.println("Factorial using for loop");
        int n=4;
        int factorial=1;
        for (int i=1; i<=4; i++){
            factorial *=i;
        }
        System.out.println(factorial);*/

        //Repeat 5 using while loop

        /*while (true){
            System.out.println("5");
        }*/

        //Repeat 8 using do-while loop

       /* do {
            System.out.println("8");
        }while (true);*/

        //Repeat 11 using for loop

        for (int i=1; i>11; i++){
            System.out.println("11");
        }








    }
}
