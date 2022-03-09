package set;
import model.Person;

import java.util.*;

public class HashSetPerson {
    public void createSet(){
        //syntax: CollectionName<DataType> ObjectName=New CollectionName();
        HashSet<Person> mySet=new HashSet<>();

        Person person1=new Person("Rajendar Singh", 55,85);
        System.out.println(person1.hashCode());
        Person person2=new Person("Rajendar Singh", 55,85);
        System.out.println(person2.hashCode());
        Person person3=new Person("Kabir Singh", 40,75);
        Person person4=new Person("Sohan Singh", 40,75);
        System.out.println(person3.hashCode());

        mySet.add(person1);
        mySet.add(person2);
        mySet.add(person3);

        for (Person var: mySet){
            System.out.println(var.getName() + " HashCode "+var.hashCode());
        }
    }

    public static void main(String[] args) {
        HashSetPerson obj=new HashSetPerson();
        obj.createSet();
    }

}
