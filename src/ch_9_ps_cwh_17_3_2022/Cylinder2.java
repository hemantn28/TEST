package ch_9_ps_cwh_17_3_2022;

public class Cylinder2 {
    private int radius;
    private int height;

    public Cylinder2(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public double getSurfaceArea(){
        //surfaceArea=2*pi*r*h+2*pi*r*r;
        double SurfaceArea=2*Math.PI*radius*height+2*Math.PI*radius*radius;
        return SurfaceArea;
    }

    public double getVolume(){
        //volume=pi*r*r*h;
        double volume=Math.PI*radius*radius*height;
        return volume;
    }


    public static void main(String[] args) {
        Cylinder2 cl=new Cylinder2(8,12);

        System.out.println(cl.getSurfaceArea());

        System.out.println(cl.getVolume());


    }
}
