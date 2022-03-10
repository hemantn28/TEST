public class NestedIfElse {
    public static void main(String[] args) {
        int age=15;
        String city="LUCKNOW";

        if (age>18 && !(city=="AGRA")){
            System.out.println("He is eligible for voting");
        }
        else{
            System.out.println("He is not eligible for voting");
        }

    }
}
