package class_and_object;

public class City {
    //data member
    String city;
    int population;
    String state;

    //parameterized constructor

    public City(String city, int population, String state) {
        this.city = city;
        this.population = population;
        this.state = state;
    }

    public static void main(String[] args) {
        City obj=new City("Mumbai", 6000000,"Maharashtra");
        System.out.println("Printing "+ obj.city +" "+obj.population +" "+obj.state);
    }
}
