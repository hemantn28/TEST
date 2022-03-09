package miscellaneous_cwh;

public class StringMethods {
    public static void main(String[] args) {

    String name="solution";
    System.out.println(name);
    int value=name.length();
        System.out.println(value);
        /*String lowerstring=name.toLowerCase();
        System.out.println(lowerstring);*/
        String uppercase=name.toUpperCase();
        System.out.println(uppercase);

        String nonTrimmedString="    Vikas       ";
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(1));

        System.out.println(name.substring(2,6));

        System.out.println(name.replace('o','i'));
        System.out.println(name.replace("olu","asd"));

        System.out.println(" I am escape sequence \\ double quote");





    }
}
