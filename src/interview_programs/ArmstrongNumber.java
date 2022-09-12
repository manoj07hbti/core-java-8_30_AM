package interview_programs;

public class ArmstrongNumber {

   public void armstrongNumber(){

       int number = 371, originalNumber, remainder, result = 0;

       originalNumber = number;

       while (originalNumber != 0)
       {
           remainder = originalNumber % 10;
           result += Math.pow(remainder, 3);
           originalNumber /= 10;
       }

       if(result == number)
           System.out.println(number + " is an Armstrong number.");
       else
           System.out.println(number + " is not an Armstrong number.");

   }


    public static void main(String[] args) {
        ArmstrongNumber obj= new ArmstrongNumber();
        obj.armstrongNumber();
    }
}
