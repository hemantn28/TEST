package ch_9_ps_cwh_17_3_2022;

import lombok.Getter;
import lombok.Setter;

//Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.
@Getter
@Setter
public class Rectangles {
    private int length;
    private int breadth;

    public Rectangles() {
        this.length = 4;
        this.breadth= 5;
    }

    public Rectangles(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static void main(String[] args) {
       /*Rectangles rc = new Rectangles(4, 5);

        System.out.println(rc.breadth);
        System.out.println(rc.length);

        Rectangles rc2=new Rectangles(6,8);
        System.out.println(rc2.length+","+rc2.breadth);*/

        Rectangles r=new Rectangles(12,56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());


    }


}
