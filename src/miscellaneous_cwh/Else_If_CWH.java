package miscellaneous_cwh;

public class Else_If_CWH {
    public static void main(String[] args) {
        int age=29;

        if (age>60){
            System.out.println("You are experienced");
        }
        else if (age>45){
            System.out.println("You are semi experienced");
        }
        else if (age>30){
            System.out.println("You are semi-semi experienced");
        }
        else{
            System.out.println("You are a beginner");
        }
    }
}
