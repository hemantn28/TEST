package collections;

import model.Employee;

import java.util.ArrayList;

public class ArrayListEmployeeH {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList=new ArrayList<>();

        //create object of employee class
        Employee employee1=new Employee("Abhinav",84265,"IT");
        Employee employee2=new Employee("Vicky",78214,"Backend");
        Employee employee3=new Employee("Sushant",69437,"Sales");

        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);

        for (Employee var: employeeArrayList){
            System.out.println(var.getName());
            System.out.println(var.getSalary());
            System.out.println(var.getDeptt());
        }
    }
}
