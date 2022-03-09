package method_and_object;

public class Books {
    //data member
    String name;
    int pages;
    String author;

    //capabilities
    //syntax:access_specifier return type method name(){CODE}
    //READ
    public  void read(){
        System.out.println("this is read method");
    }
    //write
    public void write(){
        System.out.println("this is write method");
    }

    public static void main(String[] args) {
        Books obj=new Books();
        obj.read();
        obj.write();
    }
}
