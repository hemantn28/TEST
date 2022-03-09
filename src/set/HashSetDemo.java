package set;

import java.util.HashSet;

public class HashSetDemo {
    public void createHashSet(){
        //syntax: CollectionName <datatype> ObjectName=new CollectionName();

        HashSet<Double> myHashSet=new HashSet<>();

        myHashSet.add(45.3);
        myHashSet.add(45.3);
        myHashSet.add(83.1);
        myHashSet.add(83.1);
        myHashSet.add(71.4);

        for (Double var: myHashSet){
            System.out.println(var);
        }
    }

    public static void main(String[] args) {
        HashSetDemo obj=new HashSetDemo();
        obj.createHashSet();
    }
}
