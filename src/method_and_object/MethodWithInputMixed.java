package method_and_object;

public class MethodWithInputMixed {
    public void message(String name){

        String var=name;
        System.out.println("this is message method "+var);
    }
    public void checkEligibility(int age){
        if (age>18){
            System.out.println("eligible for voting");
        }
        else{
            System.out.println("not eligible for voting");
        }
    }
    public void makecube(int num){
        int cube=num*num*num;
        System.out.println("cube is "+cube);
    }
    public void test(String name, String city){
        System.out.println("name is name");
        System.out.println("city is "+city);
    }
    public void excellence(int marks){
        if (marks>90){
            System.out.println("student is highly brilliant");
        }
        else if (marks>80){
            System.out.println("Student is brilliant");
        }
        else if (marks>70){
            System.out.println("student is intelligent");
        }
        else if (marks>60){
            System.out.println("student is good");
        }
        else if (marks>50){
            System.out.println("student is average");
        }
        else{
            System.out.println("student is poor");
        }
    }

    public static void main(String[] args) {
        MethodWithInputMixed obj=new MethodWithInputMixed();
        obj.message("Shyam");
        obj.checkEligibility(19);
        obj.makecube(12);
        obj.test("Pankaj","Agra");
        obj.excellence(45);
    }
}
