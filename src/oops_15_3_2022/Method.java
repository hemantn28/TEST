package oops_15_3_2022;

public class Method {

    public void enjoy(String name){
        String var=name+  " Welcome to Wonderland ";

        System.out.println("You can enjoy "+var);
    }
    public  void test(String name, int age){

        System.out.println("Name is "+name);
        System.out.println("age is "+age);
    }
    public void checkEligibility(int age){
        if (age>18){
            System.out.println("you are eligible for voting");
        }
        else{
            System.out.println("you are not eligible for voting");
        }

    }
    public void makeSquare(int num){
        int result=num*num;
        System.out.println("result is "+result);

    }
    public void makeCube(int num){
        int result=num*num*num;
        System.out.println("result is "+result);
    }
    public void checkIncome(String name, double salary){

        System.out.println(name + " your salary is  "+salary);
    }


    public static void main(String[] args) {
        Method obj=new Method();
        obj.enjoy("Himesh");
        obj.test("Rahul",23);
        obj.checkEligibility(30);
        obj.makeSquare(25);
        obj.makeCube(10);
        obj.checkIncome("Nitesh",91324.50);
    }


}
