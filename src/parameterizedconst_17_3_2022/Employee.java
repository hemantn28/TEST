package parameterizedconst_17_3_2022;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee ep1=new Employee("Ram",85643.25);
        System.out.println(ep1.name+" "+ep1.salary);

        Employee ep2=new Employee("Shobhit",75963.14);
        System.out.println(ep2.name+" "+ep2.salary);

        Employee ep3=new Employee("Priyanka",63521.45);
        System.out.println(ep3.name+" "+ep3.salary);

        Employee ep4=new Employee("Sachin",62354.98);
        System.out.println(ep4.name+" "+ep4.salary);

        Employee ep5=new Employee("Rohit",63987.52);
        System.out.println(ep5.name+" "+ep5.salary);

        }
}
