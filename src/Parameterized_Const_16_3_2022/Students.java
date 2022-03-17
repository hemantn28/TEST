package Parameterized_Const_16_3_2022;

public class Students {
    String name;
    String subject;
    int marks;

    public void CheckMarks(){
        System.out.println("Marks are good");
    }
    public void checkMathsmarks(int num){
        System.out.println(num);
    }
    public String knowSubject(){
          String subject="Physics";
        return subject;
    }
    public void getInfo(){

        System.out.println("Name is "+name);
        System.out.println("Subject is "+subject);
        System.out.println("Marks are "+marks);
    }

    public static void main(String[] args) {
        Students st=new Students();
        st.CheckMarks();
        st.checkMathsmarks(90);
        String subject=st.knowSubject();
        System.out.println(subject);
        st.name="Barman";
        st.subject="Science";
        st.marks=98;
        st.getInfo();

        Students st2=new Students();
        st2.name="Kavya";
        st2.subject="Maths";
        st2.marks=74;
        st2.getInfo();

        Students st3=new Students();
        st3.name="Vishakha";
        st3.subject="Biology";
        st3.marks=69;
        st3.getInfo();

    }
}
