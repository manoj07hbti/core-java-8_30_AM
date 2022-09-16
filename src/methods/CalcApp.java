package methods;

import java.util.Scanner;

public class CalcApp {

    public int add(int a, int b){

       return  a+b;
    }


    public int sub(int a, int b){

        return  a-b;
    }

    public int multi(int a, int b){

        return  a*b;
    }

    public double divide(int a, int b){

        return (double)a/b;
    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        CalcApp obj= new CalcApp();

        String flag="Y";

        while (flag=="Y" || flag.equals("Y")){
            System.out.println("Please enter value of a: ");
            int a= scanner.nextInt();

            System.out.println("Please enter value of b: ");
            int b= scanner.nextInt();

            System.out.println("Please enter Choice 1: addition , 2 subtraction, 3: for multi and 4 for Divide");
            int choice=scanner.nextInt();

            if(choice==1) {
                int result = obj.add(a,b);
                System.out.println("SUM is "+result);
            }
            else if(choice==2){
                int result = obj.sub(a,b);
                System.out.println("SUB is "+result);

            }
            else if(choice==3){
                System.out.println("Multi is "+obj.multi(a,b));
            }
            else {
                System.out.println("Division is "+obj.divide(a,b));
            }


            System.out.println("Press Y to continue or press any key to exit from Calculator");
            Scanner scanner1= new Scanner(System.in);
            flag=scanner1.nextLine();
        }


    }
}
