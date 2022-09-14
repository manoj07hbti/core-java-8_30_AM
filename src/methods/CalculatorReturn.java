package methods;

public class CalculatorReturn {

    public int add(int a, int b){

        int result= a+b;

      return result;
    }

    public static void main(String[] args) {


        CalculatorReturn obj= new CalculatorReturn();
      int result=  obj.add(23,45);
      System.out.println("Addition is :"+result);

    }
}
