package Parameterized_Const_16_3_2022;

public class Employee {
    String name;
    String address;
    int age;

    public Employee(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee emp1=new Employee("Ram","Churu",45);
        System.out.println(emp1.name+" "+emp1.address+" "+emp1.age);

        Employee emp2=new Employee("Sarthak","Bikaner",26);
        System.out.println(emp2.name+" "+emp2.address+" "+emp2.age);

        Employee emp3=new Employee("Bablu","Bharatpur",22);
        System.out.println(emp3.name+" "+emp3.address+" "+emp3.address);

        Employee emp4=new Employee("Rishi","New Delhi",40);
        System.out.println(emp4.name+" "+emp4.address+" "+emp4.age);

        Employee emp5=new Employee("Kamesh","Noida",20);
        System.out.println(emp5.name+" "+emp5.address+" "+emp5.age);
    }
}
