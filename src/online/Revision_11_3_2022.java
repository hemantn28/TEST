package online;

public class Revision_11_3_2022 {
    public static void main(String[] args) {
        //Write a programme to print the following pattern.
        // * * * *
        //   * * *
        // * *
        //*

        /*int n=4;
         for (int i=4; i>0; i--){
             for (int j=0; j<i; j++)
             System.out.print("*");
             System.out.println("\n");
         }*/

        //Write a programme of switch case regarding salary of an employee.

       /* System.out.print("Enter ur salary: ");
         Scanner sc=new Scanner(System.in);
         int salary=sc.nextInt();

         switch (salary){
             case 1:
                 System.out.println("u r highly paid");
                 break;
             case 2:
                 System.out.println("U r fairly paid");
                 break;
             case 3:
                 System.out.println("U r moderately paid");
                 break;
             case 4:
                 System.out.println("U r averagely paid");
                 break;
             default:
                 System.out.println("u r paid");
         }*/

        //write a programme to print the following programme.
        // * * * *
        // * * *
        // * *
        //  *
        /*int n=4;
        for (int i=n; i>0; i--){
            for (int j=0;j<i;j++)
            System.out.print("*");
            System.out.print("\n");
        }*/
        //write a programme to sum first n even numbers.
        /*int sum=0;
        int n=5;
        for (int i=0; i<n; i++){
            sum=sum + (2*i);
        }
        System.out.print("sum of even numbers is: "+sum);*/

        //Write a programme to print multiplication table of a given number n.
        /*int n=3;
        for (int i=1; i<=10; i++){
           int result=n*i;
            System.out.println("result: "+result);
        }*/
        //Write a programme to print multiplication table of a given number n. in reverse order.
        /*int n=5;
        for (int i=10; i>0; i--){
            int result=n*i;
            System.out.println("Table of 5 in reverse order: "+result);
        }*/
        /*int i=0;
        while(i<5){
            System.out.println("Hello "+i);
            i++;
        }*/

        /*int i=0;
        do {
            System.out.println("Hello "+i);
            i++;
        }while (i<5);*/

        //Display numbers from 1 to 5.

        /*int i=1;
        int n=5;
        while (i<=n){

            System.out.println(i);
            i++;
        }*/
        // Java program to find the sum of positive numbers.
        /*int sum=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        while (number>=0){
            sum = + number;
            System.out.println("Enter a number: ");
            number=sc.nextInt();
            System.out.println("Sum is "+sum);
        }


  }*/
        // Java Program to display numbers from 1 to 5 using do while loop.
        /*int i = 1;
        int n = 5;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);*/

        //Print number from 1 to 10 using while loop.

       /* int i=1;
        while (i<=10){
            System.out.println("while: "+i);
            i++;
        }*/

        //Print number from 1 to 10 using do-while loop.

        /*int j=1;
        do {
            System.out.println("do-while: "+j);
            j++;
        }while (j<=10);*/

        //print only even numbers using while loop.

       /*int i=1;
       do {
           if (i%2==0)
               System.out.println("do-while loop: "+i);
           i++;
       }while (i<11);

        //print only even numbers using while loop.
         int j=1;
         while (j<11){
             if (j%2==0)
                 System.out.println("while loop: "+j);
             j++;
         }*/
        //Repeat 5 using while loop.
       /* while (true){
            System.out.println(1);
        }*/
        //Repeat 5 using do-while loop.
       /* do {
            System.out.println(5);
        }while(true);*/
        //write a programme to find the factorial of a given number using while loop.
        int n=4;
        int i=1;
        int factorial=1;
        while (i<=n){
            factorial *=i;
            i++;
        }
        System.out.println("factorial: "+factorial);

        //write a programme to find the factorial of a given number using for loop.
       /*int n=4;

        int factorial=1;
        for (int i=1; i<=n; i++){
            factorial*=i;

        }System.out.println("factorial is "+factorial);*/

        //Write a programme to calculate the sum of the numbers occurring in the multiplication table of 8.
        /*int n=8;
        int sum=0;
        for (int i=1; i<=10; i++){
            sum +=n*i;
        }
        System.out.println("Sum is "+sum);*/

        //Repeat 2 using for loop.







    }
}
