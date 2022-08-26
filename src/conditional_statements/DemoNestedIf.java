package conditional_statements;

public class DemoNestedIf {

    public static void main(String[] args) {

        int number=0;

        if(number>0){

            if(number%2==0){
                System.out.println("Number is even Number :"+number);
            }
            else {
                System.out.println("Number is odd Number :"+number);
            }


        }
        else {
            System.out.println("Number Should be greater than Zero");
        }


    }
}
