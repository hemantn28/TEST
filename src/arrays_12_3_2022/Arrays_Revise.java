package arrays_12_3_2022;

import javax.swing.*;

public class Arrays_Revise {
    public static void main(String[] args) {
        //Declaration & Memory Allocation.
        /*int [] marks= new int[5];

        marks[0]=100;
        marks[1]=76;
        marks[2]=98;
        marks[3]=69;
        marks[4]=74;
        marks[4]=96;

        System.out.println(marks[3]);
        System.out.println(marks.length);

        for (int i= marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
        float [] price;
        price=new float[7];

        price[0]=84.5f;
        price[1]=87.7f;
        price[2]=56.6f;
        price[3]=45.1f;
        price[4]=80.0f;
        price[5]=79.9f;
        price[6]=64.3f;

        System.out.println(price[5]);
        System.out.println(price.length);

        for (float var: price){
            System.out.println(var);
        }
        System.out.print("printing in reverse order");
        for (int i= price.length-1; i>=0; i--){
            System.out.print(",");
            System.out.print(price[i]);
        }

        System.out.println("printing in same order");
        for (int i=0; i< price.length; i++){

            System.out.print(",");
            System.out.print(price[i]);
        }

        String [] name={"Ram","Bahadur","Shyam","Krishna","Uddhav","Umesh"};

        System.out.println(name[4]);
        System.out.println(name.length);

        for (String var: name){
            System.out.println(var);
        }
        for (int i= name.length-1; i>=0; i--){
            System.out.println(name[i]);
        }
        for (int i=0; i<= name.length; i++){
            System.out.println(name[i]);
        }*/
        //Q.1 Create an array of 5 floats and calculate their sum.
       /* float [] price= {89.2f,45.6f,74.3f,69.1f,101.5f};

        float sum=0;
        for (float var:price){
            sum=sum + var;
        }
        System.out.println(sum);*/

        //Create an array of 7 double and calculate their multiplication.

        /*double [] salary= {85964.50,63954.3,74561.8,45687.9,102364.5,125634.10,54360.2};

        double sum=0;
        for (double var: salary){
            sum=sum + var;
        }
        System.out.println(sum);*/

        // Q.2. Write a programme to find out whether a given integer is present in an array or not.

        /*int [] nums ={45,65,23,14,87,91,80};

        int num=91;
        boolean isInArray=false;
        for (int var: nums){
            if (num==var){
                isInArray=true;
                break;
            }
        }
        if (isInArray){
            System.out.println("the value is present in the Array");
        }
        else {
            System.out.println("the value is not present in the Array");*/
        }
        //Calculate average marks from an Array containing marks of all students in Physics using for-each loop.

        //Marks in physics of all students are as follows.

        /*double [] marks={87,71,65,91,40,60,69,74,39,91};

        double sum=0;

        for (double var: marks){
             sum= sum+var;
        }
        System.out.print("The average marks are "+sum/ marks.length);*/

        //Q.6.Create a java programme to find the maximum number in an array.

      /*  int [] marks={45,23,87,94,12,63};
        int max=Integer.MIN_VALUE;
        for (int var:marks){
            if (var>max){
                max=var;
            }
        }
        System.out.println("The maximum number in this Array is: "+max);

        //Q.7.Create a java programme to find the minimum number in an array.

        int [] num={104,45,954,87,65,32,9,2,3,7,89};

        int min=Integer.MAX_VALUE;
        for (int element: num){
            if (element<min){
                min=element;
            }
        }
        System.out.println("The minimum number in this Array is: "+min);*/

        //Write a java programme to find whether an array is sorted or not.

        /*int[] num = {1,2,3,4,5,6,7,8,9,};

        boolean isSorted = true;
        for (int i = 0; i < num.length-1; i++) {
            if (num[i] > num[i + 1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("the array is sorted");
        }
        else {
            System.out.println("the array is not sorted");
        }*/

        //Write a java programme to calculate average using arrays.

        /*double [] num={87.2,45.4,32.1,14.0,95.9,62.4,34.5};

        double sum=0;

        for (double var: num){
            sum= sum+var;
        }
        System.out.println("the average is "+sum/ num.length);*/

        //Find the largest element in an array.

       // int [] marks={98,78,34,556,64,71,80};

        /*int max=0;
        for (int var: marks){
            if (var>max){
                max=var;
            }
        }
        System.out.println("The maximum number in this array is: "+max);*/

        //Find the smallest element in an array.

        /*int [] price ={264,987,456,325,149,751,637};

        int min=987;
        for (int var:price){
            if (var<min){
                min=var;
            }
        }
        System.out.println("The minimum number in this array is: "+min);*/


}
