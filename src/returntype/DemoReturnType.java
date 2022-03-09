package returntype;

public class DemoReturnType {
    //syntax: access_specifier return_type method_name(parameter){CODE}
    public String message(){
        String name="Sonu";
        return name;
    }

    public int checkage(){
        int age=23;
        return age;
    }
    public int makesquare(int num){
        int square=num*num;
        return square;
    }

    public static void main(String[] args) {
        DemoReturnType obj=new DemoReturnType();
        String name=obj.message();
        System.out.println("this is message method "+name);
        int age=obj.checkage();
        System.out.println("age is "+age);
        int square=obj.makesquare(2);
        System.out.println("square is "+square);
    }
}
