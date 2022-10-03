package exception_handleing;

public class Calculator {

    public int divide (int a, int b){

        int result=0;

        try {
             result = a/b;
        }
        catch (RuntimeException  e){

            System.out.println("Exception occurred ..."+e);
        }
        catch (Exception e){

            System.out.println("Exception occurred ..."+e);
        }


        return result;
    }


    public static void main(String[] args) {

        Calculator obj= new Calculator();
        int result =obj.divide(10,0);

        System.out.println("DIVIDE is : "+result);
    }
}
