package set;

import java.util.HashSet;

public class HashSetMyself {
    public void createHashSet(){
        //syntax: CollectionName<datatype> Objectname= New CollectionName();

        HashSet<String> myHasSet=new HashSet<>();

        myHasSet.add("India");
        myHasSet.add("India");
        myHasSet.add("Russia");
        myHasSet.add("Russia");
        myHasSet.add("USA");
        myHasSet.add("USA");
        myHasSet.add("China");

        System.out.println(myHasSet.contains("France"));


        for (String var: myHasSet){
            System.out.print(var);
            System.out.print(",");


        }
    }

    public static void main(String[] args) {
        HashSetMyself obj=new HashSetMyself();
        obj.createHashSet();
    }
}
