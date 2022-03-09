package method_and_object;

public class Children {
    //data member
    String name;
    int age;

    //capabilities

    //play
    public void play(){
        System.out.println("this is paly method");
    }
    //makenoise
    public void makenoise(){
        System.out.println("this is makenoise method");
    }

    public static void main(String[] args) {
        Children obj=new Children();
        obj.play();
        obj.makenoise();
    }
}
