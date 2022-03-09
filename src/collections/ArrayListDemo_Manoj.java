package collections;

import java.util.ArrayList;

public class ArrayListDemo_Manoj {
    //Syntax: CollectionName<datatype> objname=new CollectionName();
    public void createArrayList(){

        ArrayList myArrayList=new ArrayList();
       // ArrayList myArrayList2=new ArrayList();

        //add
        //myArrayList2.add("Steve");
        //myArrayList2.add("Ricky");
        //myArrayList2.add("Smith");

        myArrayList.add("Raj");
        myArrayList.add("Shahid");
        myArrayList.add("Rahul");
        myArrayList.add("Sounak");
       /* myArrayList.add(0,"Rashid");
        myArrayList.add(3,"Sounak");
        myArrayList2.add(1,"Mark");
        myArrayList.addAll(0,myArrayList2);
        System.out.println(myArrayList.contains("Rashid"));
        System.out.println(myArrayList.indexOf("Sounak"));
        System.out.println(myArrayList.lastIndexOf("Sounak"));
        System.out.println(myArrayList.remove("Shahid"));
        myArrayList.set(1,"Manisha");*/

        //get(index)
        //System.out.println(myArrayList.get(0));
        //System.out.println(myArrayList.get(2));

        for (int i=0; i<myArrayList.size(); i++){
            System.out.println(myArrayList.get(i));


            //advance for loop: Syntax: for(Datatype var:array/collection){code}

            for (Object var: myArrayList){
                System.out.println("ADVANCE FOR LOOP: "+var);
            }
        }
    }
        public static void main(String[] args) {
        ArrayListDemo_Manoj obj=new ArrayListDemo_Manoj();
        obj.createArrayList();
    }


}