package methods;

import class_and_objects.Student;

public class MethodOutput {

    public int makeSquare(int number){

        int square=number*number;

        return square;
    }

    public String welcome(String name){

        String message ="Welcome to java "+name;

        return message;
    }

    public Student getStudent(){

        Student student= new Student("Rahul",21,"IT");

        return student;
    }


    public static void main(String[] args) {

        MethodOutput obj= new MethodOutput();
       int result= obj.makeSquare(3);

       System.out.println("Square of given number is :"+result);

      String message= obj.welcome("Rohit");

      System.out.println(message);

     Student var= obj.getStudent();
     System.out.println(var.getName() + " "+var.getAge()+" "+var.getSection());
    }
}
