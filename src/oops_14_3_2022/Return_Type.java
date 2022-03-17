package oops_14_3_2022;

public class Return_Type {
    //syntax: access_specifier return_type method_name(parameter){code}
    
    public String name(){
        String name="Hafiz";
        return name;
    }
    public int getAge(){
        int age=23;
        return age;
    }
    public double getsalary(){
        double salary=98000.50;
        return salary;
    }
    public int makesquare(int num){
        int result=num*num;
        return result;
    }

    public static void main(String[] args) {
        Return_Type r1=new Return_Type();
        String name= r1.name();
        System.out.println(name);
        int age= r1.getAge();
        System.out.println(age);
        double salary= r1.getsalary();
        System.out.println(salary);
        int result=r1.makesquare(8);
        System.out.println(result);
    }
}
