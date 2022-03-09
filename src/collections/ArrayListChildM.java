package collections;

import model.Children;

import java.util.ArrayList;

public class ArrayListChildM {
    public void createList(){
        //syntax: CollectionName <DataType> Object_name=new CollectionName();
        ArrayList <Children> childrenArrayList=new ArrayList<>();

        Children children1=new Children("Golu",2,8);
        Children children2=new Children("Chhotu",3,10);
        Children children3=new Children("Ranu",1,5);

        childrenArrayList.add(children1);
        childrenArrayList.add(children2);
        childrenArrayList.add(children3);

        for (Children var: childrenArrayList){
            System.out.println(var.getName());
            System.out.println(var.getAge());
            System.out.println(var.getWeight());
        }
    }

    public static void main(String[] args) {
        ArrayListChildM obj=new ArrayListChildM();
        obj.createList();
    }

}
