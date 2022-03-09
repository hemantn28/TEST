package map;

import java.util.HashMap;

public class HashMapDemoM {
    public void createHashMap(){

        //syntax:CollectionName<Datatype_key datatype_value> ObjName=New CollectionName();

        HashMap<Integer, String> myHashMap=new HashMap<>();

        //adding element
        myHashMap.put(1,"Maths");
        myHashMap.put(2,"Hindi");
        myHashMap.put(3,"English");
        myHashMap.put(4,"Science");
        myHashMap.put(5,"Social Science");
        myHashMap.put(5,"Geography");

        System.out.println(myHashMap);

        //getting an element
        System.out.println(myHashMap.get(5));

        //deleting an element
        System.out.println(myHashMap.remove(3));

        System.out.println(myHashMap);
        System.out.println(myHashMap.containsKey("Geography"));

        for (Integer var: myHashMap.keySet()){
            System.out.println(myHashMap.get(var));
        }
    }

    public static void main(String[] args) {
        HashMapDemoM obj=new HashMapDemoM();
        obj.createHashMap();
    }
}
