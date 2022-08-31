package loops;

public class DemoWhileLoop {
    public static void main(String[] args) {

        // SYNTAX : while (condition){
        //	              //code to be executed
        //	               Increment  statement
        //                 }

        int i=0;

        while(i<5){

            System.out.println("Demo While Loop..."+i);
            i++; // i=i+1
        }

        //Decrement while Loop
        i=10;

        while (i>0){
            System.out.println("Demo Decrement while loop "+i);
            i--; // i=i-1
        }

// INFINITE LOOP

        int j=1;

        while (j>0){

            System.out.println("This is infinite loop...."+j);
            j++;
        }

    }
}
