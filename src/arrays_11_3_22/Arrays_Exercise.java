package arrays_11_3_22;

public class Arrays_Exercise {
    public static void main(String[] args) {
        //Make an Array of 7 cities and apply Array methods.
        /*String [] cities={"Agra","Jaipur","Rampur","Jamshedpur","Ranchi","Lucknow"};

        System.out.println(cities[4]);
        System.out.println(cities.length);*/

       /* System.out.println("Printing incremental loop");

        for (int i=0; i< cities.length; i++){
            System.out.println(cities[i]);
        }
        System.out.println("Printing decremental loop");

        for (int i= cities.length-1; i>0; i--){
            System.out.println(cities[i]);
        }*/
        //printing using advance for loop
        /*for (String var: cities){
            System.out.println(var);
        }*/

        //Make an Array of 6 salaries and apply Array methods.
        double salary []= {89546.5,65325.6,45632.9,78563.0,63251.9,82361.0};

        System.out.println(salary[5]);
        System.out.println(salary.length);

       /* for (int i=0; i< salary.length; i++){
            System.out.println(salary[i]);
        }
        System.out.println("using decremental for loop");
        for (int i= salary.length-1; i>=0; i--){
            System.out.println(salary[i]);
        }*/
        for (double var: salary){
            System.out.println(var);
        }


    }
}
