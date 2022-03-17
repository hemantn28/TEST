package oops_15_3_2022;

public class Employee1 {
    /*Create a class Employee1 with following properties and methods.
      Salary(property)(int)
      getSalary(method returning int)
      name (property)(String)
      getName(method returning String)
      setName(method changing name)
      */
    String name;
    int salary;

    public String getName(){
        String name ="Amandeep";
        return name;
    }
    public int getSalary(){
        int salary=85000;
        return salary;
    }


    public static void main(String[] args) {
        Employee1 emp1=new Employee1();
        String name= emp1.getName();
        System.out.println(name);

        int salary=emp1.getSalary();
        System.out.println(salary);



    }
}
