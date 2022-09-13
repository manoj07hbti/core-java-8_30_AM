package methods;

public class MethodInputParam {

    //TODO SYNTAX : access_specifier return_type  method_name (input parameter) {CODE..}

    public void message(String name){

        System.out.println("Welcome to Java Programming ..."+name);
    }

    public void makeSquare(int number){

        int square=number*number;
        System.out.println("Square of given Number is : "+square);

    }

    public void checkEligibility(int age, String city){

        if(age>18 & city=="DELHI"){

            System.out.println("Eligible for voting in DELHI");
        }
        else {
            System.out.println("Not Eligible for Voting in Delhi");
        }

    }

    public static void main(String[] args) {

        MethodInputParam obj = new MethodInputParam();
        obj.message("Mukesh"); // obj.methodName(value);
        obj.makeSquare(12);
        obj.checkEligibility(21,"DELHI");
    }

}
