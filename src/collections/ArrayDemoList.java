package collections;

import java.util.ArrayList;

public class ArrayDemoList {
    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<>();

        //add
        l1.add("Rakesh");
        l1.add("Madhu");
        l1.add("Hina");
        l1.add("Chitransh");
        l1.add("Lokesh");
        l1.add("Hina");


        System.out.println(l1.contains("Hina"));
        System.out.println(l1.indexOf("Hina"));
        System.out.println(l1.lastIndexOf("Hina"));
        System.out.println(l1.remove("Lokesh"));
        l1.set(1,"Sayra");

        for (int i=0; i< l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}
