package ch_9_ps_cwh_17_3_2022;

import lombok.Getter;
import lombok.Setter;

/*Create a class cylinder and use getters and setters to set its radius and heights.
  Also calculate the surface area and volume of cylinder*/

@Getter
@Setter

public class Cylinder {

       /* private int radius=14;
    private int height=8;*/

    private int radius;
    private int height;

    public double surfaceArea(){
        //Surface Area=2*PI*r*h + 2*PI*r*r;
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
    public double getVolume(){
        double volume=Math.PI*radius*radius*height;
        return volume;
    }

    public static void main(String[] args) {
        Cylinder mycl=new Cylinder();
      /*  mycl.getHeight();
        System.out.println(mycl.getHeight());

        mycl.getRadius();
        System.out.println(mycl.getRadius());

        mycl.setRadius(16);
        System.out.println(mycl.getRadius());

        mycl.setHeight(10);
        System.out.println(mycl.getHeight());*/

        mycl.setHeight(12);
        System.out.println(mycl.getHeight());

        mycl.setRadius(8);
        System.out.println(mycl.getRadius());

        System.out.println(mycl.surfaceArea());

        System.out.println(mycl.getVolume());



    }

}


