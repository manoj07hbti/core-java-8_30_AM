package scanner;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

     // Create object of scanner class

        Scanner scanner= new Scanner(System.in);

     // Reading String Data

     System.out.println("Please enter you name  :");

     String name= scanner.nextLine();// reads String input

     System.out.println("Entered name is  :"+name);

     // Reading integer input
     System.out.println("Please enter you age ");
     int age=scanner.nextInt(); // Reads integer input
        System.out.println("Entered age is : "+age);

     // reading decimal value
     System.out.println("Please enter salary :");

      double salary=scanner.nextDouble();// Reads decimal value

        System.out.println("Entered Salary is :" +salary);


    }
}
