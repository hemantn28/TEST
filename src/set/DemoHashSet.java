package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoHashSet {
    public void createHashSet(){

        //syntax: CollectionName<Datatype> ObjName=New CollectionName();

        HashSet <String> myHashSet=new HashSet<>();
        LinkedHashSet<String> myLinkedHashSet=new LinkedHashSet<>();

        myLinkedHashSet.add("Neha");
        myLinkedHashSet.add("Surbhi");
        myLinkedHashSet.add("Lata");
        myLinkedHashSet.add("Meenakshi");

        for (String var:myLinkedHashSet){
            System.out.println(var);
        }

        myHashSet.add("Rana");
        myHashSet.add("Rana");
        myHashSet.add("Amar");
        myHashSet.add("Amar");
        myHashSet.add("Daniel");
        myHashSet.add("Daniel");
        myHashSet.add("Anam");
        myHashSet.add("Anam");

        for (String var: myHashSet){
            System.out.println(var);
        }
    }
    public void createIntegerHashSet(){
        //syntax: CollectionName<Datatype> ObjectName=New collectionName();

        HashSet<Integer> integerHashSet=new HashSet<>();

        integerHashSet.add(2);
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(3);
        integerHashSet.add(1);
        integerHashSet.add(1);

        for (Integer var: integerHashSet){
        System.out.println(var);
        }
    }

    public static void main(String[] args) {
        DemoHashSet obj=new DemoHashSet();
        obj.createHashSet();
        obj.createIntegerHashSet();
    }

}
