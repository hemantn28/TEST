package collections;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        //syntax:CollectionName<datatype> objname=new CollectionName(){CODE}

        ArrayList<Integer> obj=new ArrayList<>();
        ArrayList<Integer> demo=new ArrayList<>(5);

        //add
        demo.add(1);
        demo.add(9);
        demo.add(0,5);

        obj.add(45);
        obj.add(74);
        obj.add(12);
        obj.add(80);
        obj.add(31);
        obj.add(74);
        obj.addAll(0,demo);
        System.out.println(obj.contains(9));
        System.out.println(obj.indexOf(74));
        System.out.println(obj.lastIndexOf(74));
        System.out.println(obj.remove(5));
        obj.set(2,425);


        for (int i=0; i<obj.size(); i++){
            System.out.print(obj.get(i));
            System.out.print(",");
        }
    }
}
