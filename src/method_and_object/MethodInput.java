package method_and_object;

public class MethodInput {
    public void message(String name){
        String var=name;
        System.out.println("Welcome to this world "+var);
    }
    public void checksalary(int salary){
        if (salary>90000){
            System.out.println("you are highly paid");
        }
        else if (salary>80000){
            System.out.println("you are good paid");
        }
        else if (salary>70000){
            System.out.println("you are paid moderately");
        }
        else if (salary>60000){
            System.out.println("you are paid average");
        }
        else{
            System.out.println("you are fairly paid");
        }
    }
    public void makesquare(int num){
        int square=num*num;
        System.out.println("square is "+square);
    }
    public void multiply(int a, int b){
        int multiply=a*b;
        System.out.println("multi[ly is "+multiply);
    }
    public void addition(int a, int b){
        int addition=a+b;
        System.out.println("addition is "+addition);
    }

    public static void main(String[] args) {
        MethodInput obj=new MethodInput();
        obj.message("Ritesh");
        obj.checksalary(35000);
        obj.makesquare(100);
        obj.multiply(5,4);
        obj.addition(5,4);
    }
}
