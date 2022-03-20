package getter_setter_17_3_2022;

public class NeverAgain {



    public static void main(String[] args) {
        Cat myCat=new Cat();


        myCat.getName();
        myCat.setName("Lotto");
        myCat.setWeight(3.2f);
        myCat.setAge(3);


        System.out.println(myCat.getName());
        System.out.println(myCat.getWeight());
        System.out.println(myCat.getAge());





    }
}
