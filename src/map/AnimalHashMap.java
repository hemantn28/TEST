package map;

import model.Animal;

import java.util.HashMap;

public class AnimalHashMap {
    public static void main(String[] args) {
        //syntax:CollectionName<datatype_key, datatype_value> objectname=new CollectionName();

        HashMap<Integer, Animal> animalHashMap=new HashMap<>();

        //create object of animal model class
        Animal animal1=new Animal("Lion",200,"Asian");
        Animal animal2=new Animal("Tiger",180,"African");
        Animal animal3=new Animal("Dog",70,"American");

        //add

        animalHashMap.put(1,animal1);
        animalHashMap.put(2,animal2);
        animalHashMap.put(3,animal3);

        System.out.println(animalHashMap.containsKey(4));


        for (Integer var: animalHashMap.keySet()){
            System.out.println(animalHashMap.get(var).getName());
            System.out.println(animalHashMap.get(var).getWeight());
            System.out.println(animalHashMap.get(var).getBreed());
        }
    }
}
