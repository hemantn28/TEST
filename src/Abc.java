public class Abc {
    //find the sum of first 5 natural numbers.

    //Method .1

   /* public int findsum(int n){
        int sum=n*(n+1)/2;
        return sum;
    }*/

    private String name;
    private int id;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name=n;
    }

    public int getId(){
        return id;
    }
    public void setid(int i){
        id=i;
    }

    public static void main(String[] args) {
        //Method .2

        /*int sum =0;
        for (int i=1; i<=5; i++){
            sum= sum+i;
        }
        System.out.println("sum is "+sum);*/
        Abc ab=new Abc();
       /* int sum=ab.findsum(5);
        System.out.println("Sum is "+sum);*/
       // ab.name="Vishal";
        //ab.id=1515786;

        ab.setName("Vikas");

        System.out.println(ab.getName());



    }

}
