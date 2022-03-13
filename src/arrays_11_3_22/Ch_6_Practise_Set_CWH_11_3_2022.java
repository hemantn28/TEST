package arrays_11_3_22;

public class Ch_6_Practise_Set_CWH_11_3_2022 {
    public static void main(String[] args) {

        //Q.1. Create an array of 5 floats and calculate their sum.

    //Array Syntax: Datatype [] Var_name={value1,value2,value3....};

    /*float [] distance ={89.3f,98.6f,74.1f,12.3f,61.9f};
    float sum=0;

    System.out.println(distance[3]);
    System.out.println(distance.length);

    for (int i= distance.length-1; i>=0; i--){
        System.out.println(distance[i]);
    }
    for (int i=0; i< distance.length; i++){
        System.out.println(distance[i]);
    }
        for (float var: distance){
            sum=sum+var;
        }
        System.out.println(sum);*/

        // Q.2.Write a programme to find out whether a given integer is present in an array or not.

        /*int [] marks = {89,74,56,81,63,51};
        int num=65;
        boolean isInArray=false;

        for (int var:marks){
            if (num==var){
                isInArray=true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in the Array");
        }
        else {
            System.out.println("The value is not present in the Array");
        }*/

        // Q.2.Write a programme to find out whether a given integer is present in an array or not.
        /*int [] marks = {89,74,56,81,63,51};
        int var=56;
       if (var==65){
           System.out.println("The value is present in the Array");
       }
       else {
           System.out.println("The value is not present in the Array");
       }*/
      //Q.3. Calculate the avg marks from an Array containing marks of all students in Physics using for each loop.

        float [] marks={85f,45f,79f,69f,60f};

        float sum=0;

        for (float var: marks){
            sum=sum+var;
        }
        System.out.println("avgMarks: "+sum/ marks.length);





        }



    }


