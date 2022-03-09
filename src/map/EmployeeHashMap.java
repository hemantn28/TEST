package map;

import model.Employee;

import java.util.HashMap;

public class EmployeeHashMap {
    public static void main(String[] args) {
        //syntax: Collectionaname<datatype_key,datatype_value> objectname=new Collectionaname();

        HashMap<Integer, Employee> employeeHashMap=new HashMap<>();

        //create object of employee model class
        Employee employee1=new Employee("Navdeep",250000,"Marketing");
        Employee employee2=new Employee("Navneet",88000,"Sales");
        Employee employee3=new Employee("Mahesh",90236,"Advertising");

        //add
        employeeHashMap.put(17485,employee1);
        employeeHashMap.put(18547,employee2);
        employeeHashMap.put(16214,employee3);

        for (Integer var: employeeHashMap.keySet()){
            System.out.println(employeeHashMap.get(var).getName());
            System.out.println(employeeHashMap.get(var).getSalary());
            System.out.println(employeeHashMap.get(var).getDeptt());
        }
    }
}
