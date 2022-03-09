package map;


import java.util.HashMap;

public class HashMapAgeCWH {
    public static void main(String[] args) {
        //syntax:CollectionName<Datatype_key,Datatype_value> ObjectName=new CollectionName();

        HashMap<String,Integer> age=new HashMap<>();

        age.put("Rakesh",40);
        age.put("Suresh",25);
        age.put("Deepak",20);
        age.put("Anuj",35);
        age.put("Sonu",15);

        System.out.println(age);

        System.out.println(age.get("Rakesh"));
        System.out.println(age.containsKey("Arun"));
        System.out.println(age.containsValue(21));

        age.replace("Anuj",37);
        System.out.println(age);

        age.putIfAbsent("Amar",10);
        System.out.println(age);
    }

}
