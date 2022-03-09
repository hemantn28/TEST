package exercise;

public class Fibonacci {
/* The Fibonacci series is series where the next term is the sum of its previous two terms .
    ex. 0,1,1,2,3,5,8,13,21,34,55.*/
public static void main(String[] args) {
    int n=10;
    int first_term=0;
    int second_term=1;

    System.out.println("Fibonacci Series Till " + n + " term: ");

    for (int i=1; i<=10; i++){
        System.out.println(first_term + ",");

        //compute the next term
        int nextterm=first_term+second_term;
        first_term=second_term;
        second_term=nextterm;
    }
}

}
