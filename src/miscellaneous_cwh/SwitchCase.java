package miscellaneous_cwh;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter ur age: ");
        Scanner sc=new Scanner(System.in);
        age= sc.nextInt();

        switch (age){
            case 19:
                System.out.println("U r an adult");
                break;
            case 23:
                System.out.println("U r going to join a job");
                break;
            case 60:
                System.out.println("U r retired");
                break;
            default:
                System.out.println("Enjoy ur life");

                System.out.println("Thanks for using my java code");
        }

    }
}
