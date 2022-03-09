package map;

import java.util.HashMap;

public class HashMapCWH {
    public static void main(String[] args) {
        HashMap<Integer,String> empIds=new HashMap<>();

        empIds.put(41785,"Ram");
        empIds.put(45231,"Krishna");
        empIds.put(98710,"Laxman");
        empIds.put(41365,"Sugriv");

        System.out.println(empIds);

        System.out.println(empIds.get(41785));

        System.out.println(empIds.containsKey(45287));

        System.out.println(empIds.containsValue("Dashrath"));

        empIds.put(45231,"Hanuman");
        System.out.println(empIds);

        empIds.replace(98710,"Bharat");
        System.out.println(empIds);

        empIds.putIfAbsent(235,"Chanda");
        System.out.println(empIds);

    }
}
