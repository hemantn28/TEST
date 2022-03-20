package methodcalling_17_3_2022;

public class Student {
    String name;
    String address;
    int age;

    public void read(String name){
        String var=name;
        System.out.println("Please read it. "+name);
    }
    public void write(){
        System.out.println("Please write");
    }
    public void getInfo(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student st=new Student();
        st.read("Vikas");
        st.write();
        st.name="Haneef";
        st.address="Aligarh";
        st.age=21;
        st.getInfo();

        Student st2=new Student();
        st2.name="Kalpana";
        st2.address="Patna";
        st2.age=19;
        st2.getInfo();

        Student st3=new Student();
        st3.name="Chintu";
        st3.address="Jammu";
        st3.age=17;
        st3.getInfo();
    }
}
