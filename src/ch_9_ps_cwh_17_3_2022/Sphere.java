package ch_9_ps_cwh_17_3_2022;

import lombok.Getter;
import lombok.Setter;

//Overload a constructor used to initialize a sphere of radius 4 for using custom parameters.
@Getter
@Setter

public class Sphere {
    private int radius;

    public double Volume(){
        //volume of sphere=4/3* pi*r*r*r;
        double volume=4*(Math.PI)*(radius*radius*radius)/3;
        return volume;
    }
    public double SurfaceArea(){
        //surface area of sphere=4*pi*r*r;
        double surfaceArea=4*(Math.PI)*(radius*radius);
        return surfaceArea;
    }

    public static void main(String[] args) {
        Sphere sp=new Sphere();
        sp.setRadius(4);

        System.out.println(sp.Volume());

        System.out.println(sp.SurfaceArea());

    }

}
