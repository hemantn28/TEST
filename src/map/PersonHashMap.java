package map;

import model.Person;

import java.util.HashMap;

public class PersonHashMap {
    public static void main(String[] args) {
        //syntax:CollectionName<Datatype_key,datatype_value> ObjName=new CollectionName();
        HashMap<Integer, Person> personHashMap=new HashMap<>();

        //create object of person model class
        Person person1=new Person("Rohan",21,65);
        Person person2=new Person("Sohan",25,70);
        Person person3=new Person("Mohan",30,75);

        //add
        personHashMap.put(1,person1);
        personHashMap.put(2,person2);
        personHashMap.put(3,person3);

        for (Integer var: personHashMap.keySet()){
            System.out.println(personHashMap.get(var).getName());
            System.out.println(personHashMap.get(var).getAge());
            System.out.println(personHashMap.get(var).getWeight());

        }
        

    }


}
