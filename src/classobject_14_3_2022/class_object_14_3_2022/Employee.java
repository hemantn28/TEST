package classobject_14_3_2022.class_object_14_3_2022;

public class Employee {
    //Data
    String name;
    int age;
    String deptt;

    //work
    public void work(String name){

        String var=name;
        System.out.println("In office, You have to work, "+name);
    }
    //checkAge
    public void checkAge(int age){
        if(age>18){
        System.out.println("You are eligible for voting");
    }
        else{
        System.out.println("You are not eligible for voting");
    }
    }
    //test
    public void test(String name, int age){
        String var=name;

        System.out.println(name+" "+"You are now"+" "+age);
    }
    //makeSquare
    public  void makeSquare(int num){
        int result=num*num;
        System.out.println("The square is "+result);
    }

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.work("Mahesh");
        e1.checkAge(19);
        e1.test("Laxman",25);
        e1.makeSquare(20);

    }
}

