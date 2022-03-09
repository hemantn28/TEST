package collections;
import java.util.*;
public class ArrayListDemo_CWH {
    public static void main(String[] args) {

        ArrayList<Integer> myArrayList=new ArrayList<>();
        ArrayList<Integer> myArrayList2=new ArrayList<>(5);

        //add method
        myArrayList2.add(15);
        myArrayList2.add(18);
        myArrayList2.add(19);

        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(4);
        myArrayList.add(6);
        myArrayList.add(0,5);
        myArrayList.add(0,1);
        myArrayList.addAll(0,myArrayList2);
        System.out.println(myArrayList.contains(7));

        System.out.println(myArrayList.indexOf(6));
        System.out.println(myArrayList.lastIndexOf(6));
        System.out.println(myArrayList.remove(5));
        myArrayList.set(1,566);


        // myArrayList.clear();

        for (int i=0; i< myArrayList.size(); i++){
            System.out.print(myArrayList.get(i));
            System.out.print(",");
           }


        }


    }

