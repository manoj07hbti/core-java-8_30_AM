package demo_variable;

public class VariableManipulation {

    public static void main(String[] args) {


        int number =33;

        int remainder= 19%3;

       System.out.println("remainder is "+remainder);

       int i=0;

       i++;

       System.out.println("Value of i is "+i);

       int j=5;
       j--;
       System.out.println("value os J is : "+j);

       int a=39;
       int b=7;

       int sum= a+b;

       System.out.println("SUM IS :" +sum);

       int sub= a-b;

       System.out.println("SUBTRACTION  IS :" +sub);

      int multi= a*b;

      System.out.println("Multiplication is : "+multi);

      double divide =(double) a/b; // typecasting

      System.out.println("Divide is  : "+divide);

      double c=5.7;
      double d=7.1;

      double sum_decimal= c+d;
      System.out.println("Decimal sum is "+sum_decimal);

      double divide_decimal= c/d;

      System.out.println("Decimal division is "+ divide_decimal);

    }
}
