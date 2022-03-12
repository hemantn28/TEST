package miscellaneous_cwh;
import java.util.Scanner;
public class SwitchCase_Scanner {
    public static void main(String[] args) {
        int age;
        System.out.println("enter ur age:");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();

        switch (age){
            case 18:
                System.out.println("u r going to become an adult");
                break;
            case 23:
                System.out.println("u r going to get a job");
               break;
            case 60:
                System.out.println("u r going to get retired");
               break;
            default:
                System.out.println("enjoy ur life");

                System.out.println("thanks for using my java code");


        }

    }
}
