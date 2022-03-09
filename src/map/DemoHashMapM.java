package map;

import java.util.HashMap;

public class DemoHashMapM {
    public void creareHashmap(){
        //syntax:CollectionName<datatype_key, datatype_value> Obj_name=new CollectionName();

        HashMap<Integer,String> myHashMap=new HashMap<>();

        //adding element

        myHashMap.put(123,"Kartik");
        myHashMap.put(568,"John");
        myHashMap.put(417,"Ali");
        myHashMap.put(384,"Om");
        myHashMap.put(610,"Kapil");
        myHashMap.put(417,"Fazal");
        System.out.println(myHashMap);

        //getting an element
        System.out.println(myHashMap.get(417));

        //deleting element
        System.out.println(myHashMap.remove(610));

        System.out.println(myHashMap);
        System.out.println(myHashMap.containsKey(566));
        System.out.println(myHashMap.containsValue("Tom"));


    }

    public static void main(String[] args) {
        DemoHashMapM obj=new DemoHashMapM();
        obj.creareHashmap();
    }
}
