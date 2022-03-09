package exercise;

public class FibonacciSeries {
    /* The Fibonacci series is series where the next term is the sum of its previous two terms .
    ex. 0,1,1,2,3,5,8,13,21,34,55.
    suppose first two terms are:
    first term: 0;
    second term: 1;
    next term would be calculated as :
    next term=first term+second term (0+1)
    first term=second term;(1)
    second term=next term;(1)

    next term=first term + second term;(1+1)

     */

    public static void main(String[] args) {
        int n=10;
        int firstterm=0;
        int secondterm=1;

        System.out.println("Fibonacci Series till " + n + " term: ");

        for (int i=1; i<=n; i++){
            System.out.print(firstterm + ",");

            //compute the next term
            int nextterm= firstterm + secondterm;
            firstterm=secondterm;
            secondterm=nextterm;
        }
        }




    }


