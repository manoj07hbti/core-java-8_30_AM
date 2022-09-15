package methods;

public class CalculatorReturn {

    public String add(int a, int b){

        String  result="Addition of a and b is :"+ (a+b);

      return result;
    }

    public static void main(String[] args) {


        CalculatorReturn obj= new CalculatorReturn();
      String result=  obj.add(23,45);
      System.out.println(result);

    }
}
