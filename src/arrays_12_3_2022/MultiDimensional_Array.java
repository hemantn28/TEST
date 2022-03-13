package arrays_12_3_2022;

public class MultiDimensional_Array {
    public static void main(String[] args) {

      /* int [][] flats= new int[2][3];

       flats[0][0]=101;
       flats[0][1]=102;
       flats[0][2]=103;
       flats[1][0]=201;
       flats[1][1]=202;
       flats[1][2]=203;

       for (int i=0; i<flats.length; i++){
           for (int j=0; j<flats[i].length; j++){
           System.out.print(flats[i][j]);
               System.out.print(" ");
       }
           System.out.println("\n");
       }*/
       //Create a 2-D Array.
       /*int [][] flat={
                {1,2,3},
                {4,5,6,9},
                {7},
        };
       //calculate the length of each row.
        System.out.println("Length of row 1: "+flat[0].length);
        System.out.println("Length of row 2: "+flat[1].length);
        System.out.println("Length of row 3: "+flat[2].length);

        System.out.println(flat[2][0]);*/

      //Print all elements of 2d array Using Loop.

        int[][] a={
                {1,-2,3},
                {-4,-5,6,9},
                {7},
        };

        for (int i=0; i< a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");

        }



    }
}
