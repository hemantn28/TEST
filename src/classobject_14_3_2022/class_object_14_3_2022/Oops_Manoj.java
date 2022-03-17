package classobject_14_3_2022.class_object_14_3_2022;
class Animal{
    String name;
    int weight;
    String breed;

    public Animal(String name, int weight, String breed) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
    }
}
class Monuments{
    String name;
    String city;

    public Monuments(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
class College{
    String name;
    String city;

    public College(String name, String city) {
        this.name = name;
        this.city = city;
    }
}

public class Oops_Manoj {
    String name="keshav";
    int age=23;
    String section="IT";

    public static void main(String[] args) {
        Oops_Manoj obj= new Oops_Manoj();
        System.out.println(obj.name+ " "+obj.age+" "+obj.section);

        Animal a1=new Animal("Dog",30,"Labrador");
        System.out.println(a1.name+" "+a1.weight+" "+a1.breed);

        Animal a2=new Animal("Lion",150,"Asian");
        System.out.println(a2.name+" "+a2.weight+" "+a2.breed);

        Monuments m1=new Monuments("TajMahal","Agra");
        System.out.println(m1.name+" "+m1.city);

        Monuments m2=new Monuments("Red Fort", "Delhi");
        System.out.println(m2.name+" "+m2.city);

        Monuments m3=new Monuments("Char Minar","Hyderabad");
        System.out.println(m3.name+" "+m3.city);

        Monuments m4=new Monuments("Hawa Mahal","Jaipur");
        System.out.println(m4.name+" "+m4.city);

        College c1=new College("Presidency College","Kolkatta");
        System.out.println(c1.name+" "+c1.city);

        College c2=new College("St Stephens","New Delhi");
        System.out.println(c2.name+" "+c2.city);

        College c3=new College("Sydenhem College", "Mumbai");
        System.out.println(c3.name+" "+c3.city);



    }

}
