package oops_14_3_2022;

public class School_Parameterized {
    String name;
    String type;

    public School_Parameterized(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public static void main(String[] args) {
        School_Parameterized s1=new School_Parameterized("DAV","Co-ed");
        System.out.println(s1.name+" "+s1.type);
    }
}
