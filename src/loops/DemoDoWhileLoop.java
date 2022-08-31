package loops;

public class DemoDoWhileLoop {

    public static void main(String[] args) {

        int i=0;

        //SYNTAX :  do{
        //             //code to be executed / loop body
        //             // increment or decrement
        //            }while (condition);

       do{
           System.out.println("This is Do While loop ..."+i);
           i++;

       }while (i<10);

       i=10;

       do{

           System.out.println("This is Decrement Do while Loop ...."+i);
           i--;// i=i-1
       }while (i>0);

    }
}
