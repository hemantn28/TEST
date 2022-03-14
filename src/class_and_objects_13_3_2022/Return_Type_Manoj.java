package class_and_objects_13_3_2022;

class DemoReturnType{
    //syntax: access_specifier return_type method_name(parameter){code}
    public String name(){
        String name="java";
        return name;
    }
}
class Demo{
    public int checkAge(){
        int age=23;
        return age;
    }

}

public class Return_Type_Manoj {
    public static void main(String[] args) {
        DemoReturnType obj=new DemoReturnType();
        String name=obj.name();
        System.out.println(name);

        Demo obj1=new Demo();
        int age=obj1.checkAge();
        System.out.println(age);

    }
}
