package methods;

public class MethodDay2 {

    // create a method which will make square of number
    //  SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}
    public void makeSquare(){

        int number=5;
        int square=number*number;

        System.out.println("Square of given number is "+square);
    }

    // create a method to check eligiblity of voting

    public void vote(){

        int age=19;
        if(age>18){
            System.out.println("Eligible for Voting ");
        }else {

            System.out.println("NOT Eligible for Voting ");
        }
    }

    public static void main(String[] args) {

        MethodDay2 obj= new MethodDay2();// STEP 1
        obj.makeSquare();//STEP 2

        obj.vote();// STEP 2
    }
}
