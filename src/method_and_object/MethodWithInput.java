package method_and_object;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MethodWithInput {
    //syntax: access_specifier return_type method_name(parameter){CODE}

    public void message(String name){

        String var=name + " Welcome to java";
        System.out.println("this is message method "+var);
    }
    public void checkEligibility(int age){

        if (age>18){
            System.out.println("eligible for voting");
        }
        else {
            System.out.println("not eligibility for voting");
        }

    }
    public void makesquare(int num){
        int square=num*num;
        System.out.println("sqaure is "+square);
    }
    public void test(String name, int age){
        System.out.println("name is "+name);
        System.out.println("age is "+age);
    }

    public static void main(String[] args) {
        MethodWithInput obj=new MethodWithInput();
        obj.message("Ashok");
        obj.checkEligibility(19);
        obj.makesquare(7);
        obj.test("Rana",22);
    }
}
