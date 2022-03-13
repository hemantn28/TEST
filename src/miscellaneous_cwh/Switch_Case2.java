package miscellaneous_cwh;

import java.util.Scanner;

public class Switch_Case2 {
    public static void main(String[] args) {
        /*char var='d';

        switch (var){
            case 'r':
                System.out.println("U r going to become an adult");
                break;
            case 'c':
                    System.out.println("U r going to join job");
                    break;
            case 'd':
                        System.out.println("U r retired");
                        break;
            default:
                System.out.println("Enjoy ur life");
        }*/
        //Write a java programme to check the size using the switch case statement.

        /*int num=50;


        switch (num){
            case 29:
                System.out.println("Size is small");
                break;
            case 42:
                System.out.println("Size is medium");
                break;
            case 44:
                System.out.println("Size is large");
                break;
            case 48:
                System.out.println("Size is extra large");
                break;
            default:
                System.out.println("Appropriate size");
        }*/

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size= sc.nextInt();

        switch (size){
            case 29:
                System.out.println("Size is small");
                break;
            case 42:
                System.out.println("size is medium");
                break;
            case 48:
                System.out.println("Size is large");
                break;
            case 52:
                System.out.println("size is extra large");
                break;
            default:
                System.out.println("size is appropriate");
        }*/

        //write a java programme for switch case of age.

        /*Scanner sc=new Scanner(System.in);
        System.out.print("enter ur marks: ");
        int marks=sc.nextInt();

        switch (marks){
            case 40:
                System.out.println("U  have been failed");
                break;
            case 50:
                System.out.println("U passed with just avg marks");
                break;
            case 65:
                System.out.println("U passed with first division");
                break;
            case 80:
                System.out.println("U passed with distinction in all subjects");
                break;
            case 90:
                System.out.println("U r an extraordinary student");
                break;
            default:
                System.out.println("U just passed");

        }*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price");
        int price=sc.nextInt();

        switch (price){
            case 200:
                System.out.println("product is cheap");
                break;
            case 400:
                System.out.println("product is neither cheap noe expensive");
                break;
            case 600:
                System.out.println("product is product is > cheap and < expensive");
                break;
            case 900:
                System.out.println("product is expensive");
                break;
            default:
                System.out.println("product is good");
        }
    }
}
