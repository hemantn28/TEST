package loops;

public class Break_Continue {
    public static void main(String[] args) {
        //break n continue using loops
        /*for (int i=0; i<5; i++){
            System.out.println(i);
            System.out.println("Java is great");
            if (i==2){
                System.out.println("ending the loop");
            break;
            }
        }*/
        int i=0;
        while (i<5){
            System.out.println(i);
            System.out.println("Java is great");
            if (i==2){
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }
        System.out.println("Loop ends here");
    }
}
