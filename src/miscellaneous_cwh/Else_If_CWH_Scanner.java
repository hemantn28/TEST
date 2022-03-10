package miscellaneous_cwh;
import java.util.Scanner;
public class Else_If_CWH_Scanner {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter ur age: ");
        Scanner sc=new Scanner(System.in);
        age= sc.nextInt();
        if (age>60){
            System.out.println("u r xperienced");
        }
        else if (age>45){
            System.out.println("u r semi-xperienced");
        }
        else if (age>30){
            System.out.println("u r beginner");
        }
        else{
            System.out.println("u just started ur career");
        }
    }
}
