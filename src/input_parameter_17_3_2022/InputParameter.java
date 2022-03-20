package input_parameter_17_3_2022;

public class InputParameter {

    public void getAge(int age){

        System.out.println(age);
    }
    public void getName(String name){

        System.out.println(name);
    }
    public void checkEligibility(int age){
        if (age>18){
            System.out.println("eligible for voting");
        }
        else {
            System.out.println("not eligible for voting");
        }
    }
    public void makeCube(int num){
        int cube=num*num*num;
        System.out.println(cube);
    }
    public void checkYou(String city){
        if (city=="pune"){
            System.out.println("You are in Pune");
        }
        else{
            System.out.println("You are not in Pune");
        }
    }
    public void checkMarks(int marks){
        System.out.println(marks);
    }
    public void checkSpeed(double speed){
        System.out.println(speed);
    }
    public void checkPrice(float price){
        System.out.println(price);
    }


    public static void main(String[] args) {
        InputParameter ip=new InputParameter();
        ip.getAge(21);
        ip.getName("akash");
        ip.checkEligibility(15);
        ip.makeCube(3);
        ip.checkYou("Churu");
        ip.checkMarks(45);
        ip.checkSpeed(89.5);
        ip.checkPrice(56.3f);
    }
}
