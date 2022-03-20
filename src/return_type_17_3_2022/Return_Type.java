package return_type_17_3_2022;

public class Return_Type {

    public String getName(){
        String name="Amit";
        return name;
    }
    public int getAge(){
        int age=23;
        return age;
    }
    public float getWeight(){
        float weight=56f;
        return weight;
    }
    public String getCity(){
        String city="Bikaner";
        return city;
    }
    public int getMarks(){
        int marks=84;
        return marks;
    }
    public double getPrice(){
        double price=452.5;
        return price;
    }

    public static void main(String[] args) {
        Return_Type rt=new Return_Type();

        String name=rt.getName();
        System.out.println(name);

        int age=rt.getAge();
        System.out.println(age);

        float weight=rt.getWeight();
        System.out.println(weight);

        String city= rt.getCity();
        System.out.println(city);

        int marks=rt.getMarks();
        System.out.println(marks);

        double price=rt.getPrice();
        System.out.println(price);
    }
}
