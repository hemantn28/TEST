package dsa;

public class DSA {
    public static void main(String[] args) {
        //write a programme to calculate the sum of first five odd numbers.

        int sum=0;
        int n=5;
        for (int i=0; i<=n; i++){
            sum=sum+(2*i-1);
        }
        System.out.println("sum is "+sum);


    }
}
