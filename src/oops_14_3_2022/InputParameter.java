package oops_14_3_2022;

public class InputParameter {
    String Employeename;
    int salary;
    String deptt;

    //test
    public void test(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
    //makesquare
    public void makesquare(int num){
        int result=num*num;
        System.out.println(result);
    }

    public static void main(String[] args) {
        InputParameter p1=new InputParameter();
        p1.test("Sushant",23);
        p1.makesquare(4);
    }

}
