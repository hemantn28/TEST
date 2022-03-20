package getter_setter_17_3_2022;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private int id;
    private String name;
    private String designation;
    private String company;

    public static void main(String[] args) {
        Employee emp1=new Employee();

        emp1.setId(17400);
        emp1.setName("Wahid");
        emp1.setDesignation("Manager");
        emp1.setCompany("Adobe");
        System.out.println(emp1.getId()+","+emp1.getName()+","+emp1.getDesignation()+","+emp1.getCompany());


    }
}
