package oops_15_3_2022;

public class Magazines {
    String name;
    String author;
    int price;

    //read
    public void read(){
        System.out.println("Read magazine");
    }
    //getinfo
    public void getInfo(){
        System.out.println("Gain knowledge from magazines");
    }
    public void getname(){
        System.out.println(name);
    }
    public void getauthor(){
        System.out.println(author);
    }
    public void getprice(){
        System.out.println(price);
    }

    public static void main(String[] args) {
        Magazines m1=new Magazines();
        m1.read();
        m1.getInfo();
        m1.name="India Today";
        m1.author="Arun Puri";
        m1.price=40;
        m1.getname();
        m1.getauthor();
        m1.getprice();

        Magazines m2=new Magazines();
        m2.name="The Week";
        m2.author="asdf";
        m2.price=30;
        m2.getname();
        m2.getauthor();
        m2.getprice();

        Magazines m3=new Magazines();
        m3.name="Nandan";
        m3.author="kfkjeroihf";
        m3.price=20;
        m3.getname();
        m3.getauthor();
        m3.getprice();
    }
}
