package Parameterized_Const_16_3_2022;

public class Company {
    String name;
    String city;
    int age;

    public Company(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public static void main(String[] args) {
        Company co1=new Company("Adobe","Noida",45);
        System.out.println(co1);
    }
}
